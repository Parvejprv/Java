/*
 
*/


package inheritance;

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    // Constructor
    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }
    
    public String getAccNo(){ return accNo; }
    public String getName(){ return name; }
    public String getAddress(){ return address; }
    public String getPhno(){ return phno; }
    public String getDOB(){ return dob; }
    public long getBalance(){ return balance; }
    
    public void setAddress(String add) {
        address = add;
    }
    
    public void setPhno(String phno) {
        this.phno = phno;
    }
}

class SavingsAccount extends Account {
    
    // Constructor
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    
    public void deposite(long amt) {
        if(amt > 0 ) {
            balance += amt;
            System.out.println("Deposited " + amt + ". New balance: "+ balance);
        } else {
            System.out.println("Deposited amount must be positive.");
        }
    }
    public void withdraw(long amt) {
        if(amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrew: " + amt +  ". New balance " + balance);
        } else {
            System.out.println("Insufficient balance or Invalid amount.");
        }
    }
}


class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob, long loanAmount) {
        super(acc, n, add, phno, dob);
        balance = loanAmount;       // Loan balance is initially set to loan amount
    }
    
    public void payEMI(long amt) {
        if(amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Paid EMI: " + amt + ". Remaining loan balance: " + balance);
        } else {
            System.out.println("EMI amount must be positive and should be less than or equal to the remaining balance.");
        }
    }
    
    public void repay(long amt) {
        if(amt > 0) {
            if(amt >= balance) {
                balance = 0;
                System.out.println("Loan fully repaid.");
            } else {
                balance -= amt;
                System.out.println("Partial repayment of " + amt + ". Remaining loan balance: " + balance);
            }
        } else {
            System.out.println("Repayment amount must be positive.");
        }
    }
}

public class StudentChallenge2_Account_LoanAccount_SavingAccount {
    
    public static void main(String[] args) {
        // create a Saving Account
        SavingsAccount sav = new SavingsAccount("SA123", "Nadia", "123 Main St", "9876543210", "01-01-1990");
        System.out.println("Saving Account Created. Balance: " + sav.getBalance());
        
        sav.deposite(5000);
        sav.withdraw(2000);
        sav.withdraw(4000);     // Attemp to withdraw more than then balance
        
        
        
        // Create a Loan Account
        LoanAccount loa = new LoanAccount("LA567", "BOB", "St Xavier 453", "4567890456", "01-01-2001", 20000);
        System.out.println("\nLoan Account Created. Loan Balance: " + loa.getBalance());
        
        loa.payEMI(3000);
        loa.repay(5000);
        loa.payEMI(2000);       // Partial repayment to close the loan
        
    }
    
}
