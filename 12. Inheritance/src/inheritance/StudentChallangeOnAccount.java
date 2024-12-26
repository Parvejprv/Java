/*
 
*/

package inheritance;

import java.util.Scanner;

class Account {
    final  private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected double balance;
    
    // Constructor
    public Account(String accNo, String name, String address, String phno, String dob, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.dob = dob;
        this.balance = balance;
    }
    
    /* Since the account number typically shouldn't change after creation, you might only provide a getter. */
    public String getAccountNumber() { return accNo; }      // only getter for account number
    
    /* This could be read-only for certain applications, so you might use only a getter unless name changes are allowed. */
    public String getName() { return name; }
    
    /* The address may need to be updated, so it could have both a getter and setter. */
    public String getAddress() { return address; }      // getter for address
    public void setAddress(String address) {  this.address = address; }      // setter for address
    
    /* Similar to address, it could have both a getter and setter to allow updating. */
    public String getPhone() { return phno; }      // getter for phone number
    public void setPhone(String phno) {  this.phno = phno; }      // setter for phone number
    
    /* The date of birth usually doesn’t change, so only a getter is likely needed. */
    public String getDOB() { return dob; }      // getter for dob
    
  
    // Getter for balance - no direct setter, balance changes through deposit/withdraw
    public double getBalance() { return balance; }
    
    /*
    Note:-
    -------------
    accNo and dob are read-only, so they only have getters.
    name is also read-only.
    address and phno have both getters and setters.
    balance only has a getter because changes to it are controlled by transaction methods (like deposit and withdraw) rather than direct modification.
    
    */
    
    
    // Method to Check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
    
}


// SavingAccount class
class SavingAccount extends Account {
    public SavingAccount(String accNo, String name, String address, String phno, String dob, double balance) {
        super(accNo, name, address, phno, dob, balance);
    }
    
    
    // Deposite method
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    // Withdraw method
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds to withdraw.");
        }
    }
    
    // Fixed deposit
    public void fixedDeposit(double amount, int years) {
        double interestRate = 0.5;      // Example interest rate
        double maturityAmount = amount * Math.pow(1 + interestRate, years);
        
        System.out.println("Fixed Deposite of " + amount + " for " + years + " years will mature to " + maturityAmount);
    }
    
    
    // Liquidate Fixed Deposite  method
    public void liquidate() {
        System.out.println("Fixed deposit liquidated.");
    }
}

// LoanAccount class
class LoanAccount extends Account {
    private double loanAmount;
    
    public LoanAccount(String accNo, String name, String address, String phno, String dob, double balance, double loanAmount)  {
        super(accNo, name, address, phno, dob, balance);
        this.loanAmount = loanAmount;
    }
    
    
    // Pay EMI method
    public void payEMI(double emiAmount) {
        if(emiAmount > 0 && emiAmount <= loanAmount) {
            loanAmount -= emiAmount;
            System.out.println("Paid EMI: " + emiAmount);
            System.out.println("Remaining loan amount: " + loanAmount);
        } else {
            System.out.println("Invalid EMI amount");
        }
    }
    
    // Top Up Loan  method
    public void topUpLoan(double topUpAmount) {
        if(topUpAmount > 0) {
            loanAmount += topUpAmount;
            System.out.println("Loan topped up by: " + topUpAmount);
            System.out.println("New Loan Amount: " +  loanAmount);
        } else {
            System.out.println("Invalid top-up amount.");
        }
    }
    
    // Getter for loan amount
    public double getLoanAmount() { return loanAmount; }
    
    // Check balance method specific to Loan Amount
    @Override
    public void checkBalance() {
        System.out.println("Account Balance: " + getBalance());
        System.out.println("Outstanding Loan Amount: " + loanAmount);
    }
    
}

public class StudentChallangeOnAccount {
    private static  Scanner sc = new Scanner(System.in);
    private static SavingAccount savingAccount;
    private static LoanAccount loanAccount;
    
    public static void main(String[] args) {
        boolean exit = false;
        
        while(!exit) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Create Saving Account");
            System.out.println("2. Create Loan Account");
            System.out.println("3. Deposit in Saving Account");
            System.out.println("4. Withdraw from Saving Account");
            System.out.println("5. Fixed Deposit in Saving Account");
            System.out.println("6. Liquidate Fixed Deposit");
            System.out.println("7. Pay EMI for Loan Account");
            System.out.println("8. Top Up Loan Account");
            System.out.println("9. Display Saving Account Details");
            System.out.println("10. Display Loan Account Details");
            System.out.println("11. Check Saving Account Balance");
            System.out.println("12. Check Loan Account Balance");
            System.out.println("13. Exit");
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();      // Consume newline
            
            
            switch (choice) {
                case 1:
                    createSavingAccount();
                    break;
                case 2:
                    createLoanAccount();
                    break;
                case 3:
                    if (savingAccount != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        savingAccount.deposit(depositAmount);
                    } else {
                        System.out.println("No Saving Account found. Please create one first.");
                    }
                    break;
                case 4:
                    if (savingAccount != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        savingAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No Saving Account found. Please create one first.");
                    }
                    break;
                case 5:
                    if (savingAccount != null) {
                        System.out.print("Enter amount for fixed deposit: ");
                        double fixedDepositAmount = sc.nextDouble();
                        System.out.print("Enter number of years: ");
                        int years = sc.nextInt();
                        savingAccount.fixedDeposit(fixedDepositAmount, years);
                    } else {
                        System.out.println("No Saving Account found. Please create one first.");
                    }
                    break;
                case 6:
                    if (savingAccount != null) {
                        savingAccount.liquidate();
                    } else {
                        System.out.println("No Saving Account found. Please create one first.");
                    }
                    break;
                case 7:
                    if (loanAccount != null) {
                        System.out.print("Enter EMI amount to pay: ");
                        double emiAmount = sc.nextDouble();
                        loanAccount.payEMI(emiAmount);
                    } else {
                        System.out.println("No Loan Account found. Please create one first.");
                    }
                    break;
                case 8:
                    if (loanAccount != null) {
                        System.out.print("Enter amount to top up loan: ");
                        double topUpAmount = sc.nextDouble();
                        loanAccount.topUpLoan(topUpAmount);
                    } else {
                        System.out.println("No Loan Account found. Please create one first.");
                    }
                    break;
                case 9:
                    if (savingAccount != null) {
                        System.out.println(savingAccount);
                    } else {
                        System.out.println("No Saving Account found. Please create one first.");
                    }
                    break;
                case 10:
                    if (loanAccount != null) {
                        System.out.println(loanAccount);
                    } else {
                        System.out.println("No Loan Account found. Please create one first.");
                    }
                    break;
                case 11:
                    if (savingAccount != null) {
                        savingAccount.checkBalance();
                    } else {
                        System.out.println("No Saving Account found. Please create one first.");
                    }
                    break;
                case 12:
                    if (loanAccount != null) {
                        loanAccount.checkBalance();
                    } else {
                        System.out.println("No Loan Account found. Please create one first.");
                    }
                    break;
                case 13:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    
    
    
    // Method to create Saving account
    // Method to create Saving Account
    private static void createSavingAccount() {
        System.out.println("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("Enter Phone Number: ");
        String phno = sc.nextLine();

        System.out.println("Enter Date of Birth: ");
        String dob = sc.nextLine();

        System.out.println("Enter Balance: ");
        double balance = sc.nextDouble();

        savingAccount = new SavingAccount(accNo, name, address, phno, dob, balance);
        System.out.println("Saving Account created successfully.");
    }
    
    
    
    // Method to create Loan Account
    private static void createLoanAccount() {
        System.out.println("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("Enter Phone Number: ");
        String phno = sc.nextLine();

        System.out.println("Enter Date of Birth: ");
        String dob = sc.nextLine();

        System.out.println("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.println("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        loanAccount = new LoanAccount(accNo, name, address, phno, dob, balance, loanAmount);
        System.out.println("Loan Account created successfully.");
    }
    
    
    
}


/*
Otuput
---------


*/