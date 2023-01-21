package Problems_31_to_40;

import java.util.Scanner;

public class Problem_35 {
    public static void main(String[] args) {
        //Find Factorial of a Number and the factorial number's sum of digits

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i=1,factorial=1,lastDigit=0,number = input.nextInt(),sumDigit=0;

        //finding factorial
        for(i=1;i<=number;i++){
            factorial*=i;
        }

        System.out.println("The factorial is: "+factorial);

        //finding the factorial number's sum of digits
        while(factorial>0){
            lastDigit = factorial%10;
            factorial= factorial/10;
            sumDigit+=lastDigit;
        }
        System.out.println("The factorial number's sum of digits is : "+sumDigit);
    }
}
