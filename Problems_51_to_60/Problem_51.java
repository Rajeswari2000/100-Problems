package Problems_51_to_60;

import java.util.Scanner;

public class Problem_51 {
    public static void main(String[] args) {
        //display the number in reverse order without use of String functions

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

        System.out.println("Reverse of the given number is : "+ reverse);

    }
}
