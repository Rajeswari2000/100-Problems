package Problems_1_to_10;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        //write a program to find the difference between the given number and it's reverse number.

        //Input : 12345
        //Output : 12345 - 54321 = -41976

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int num=number,reverse=0;

        //to handle negative numbers
        if(num<0){
            num=num*(-1);
        }

        //finding the reverse of the number
        while (num > 0) {
           reverse = reverse*10+(num%10);     // num%10 will give the lastDigit of num
           num=num/10;                        // num/10 eliminates the lastDigit of num
        }

        //to handle negative numbers
        if(number<0){
            reverse=reverse*(-1);
        }

        int difference = number - reverse;
        System.out.println("Difference between the given number and its reverse is: "+ difference);
    }
}
