/*
Here is the Challenges that you need to practice using the variable arguemnts:-
1. Maximum of numbers using variable arguments
2. Sum of all elements using variable arguments
3. Calculate Discount using  i.e. variable arguments.



*/
package methodpractice;


class MaxOfNumbers{
    public static int findMax(int...numbers){
        if(numbers.length == 0){
            throw new IllegalArgumentException("No numbers provided!");
        }
        
        int max = numbers[0];
        for(int num : numbers){
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
class SumOfAllElements{
    public static int calculateSum(int...elements){     
        int sum = 0;
        for(int num : elements){
            sum += num;
        }
        return sum;
    }
}


class CalculateDiscount{
    public static double calculateDiscount(double discountPercentage, double...prices)  {
        if(prices.length == 0){
            throw new IllegalArgumentException("No prices provided.");
        }
        
        // let's calculate the totalOriginalPrice
        double totalOriginalPrice = 0;
        for(double price : prices){
            totalOriginalPrice += price;
        }
        
        // discount = CP*(r/100);
        double discountAmount = (discountPercentage / 100) * totalOriginalPrice;
        return (totalOriginalPrice - discountAmount);
    }
}



public class VariableArgumentPractice {
    public static void main(String[] args) {
        
        // MaxOfNumbers
        int maxNumber = MaxOfNumbers.findMax(10, 5, 20, 40, 10, 500, 90);
        System.out.println("Maximum value : " + maxNumber);
        
        // SumOfAllElements
        int sumOfAll = SumOfAllElements.calculateSum(10, 5, 20, 40, 10, 500, 90);
        System.out.println("Sum of all elements : " + sumOfAll);
        
        // CalculateDiscount
        double discountedPrice = CalculateDiscount.calculateDiscount(20, 100, 50, 500, 9000);
        System.out.println("Discount price : " + discountedPrice);
        
    }
}











/*

// We can also calculate using these three different classes, methods


class MaxOfNumbers{
    public static int findMax(int...numbers){
        if(numbers.length == 0){
            throw new IllegalArgumentException("No numbers provided!");
        }
        
        int max = numbers[0];
        for(int num : numbers){
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
class SumOfAllElements{
    public static int calculateSum(int...elements){     
        int sum = 0;
        for(int num : elements){
            sum += num;
        }
        return sum;
    }
}


class CalculateDiscount{
    public static double calculateDiscount(double discountPercentage, double...prices)  {
        if(prices.length == 0){
            throw new IllegalArgumentException("No prices provided.");
        }
        
        // let's calculate the totalOriginalPrice
        double totalOriginalPrice = 0;
        for(double price : prices){
            totalOriginalPrice += price;
        }
        
        // discount = CP*(r/100);
        double discountAmount = (discountPercentage / 100) * totalOriginalPrice;
        return (totalOriginalPrice - discountAmount);
    }
}



*/






