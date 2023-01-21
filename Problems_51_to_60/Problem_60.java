package Problems_51_to_60;

import java.util.Scanner;

public class Problem_60 {
    public static void main(String[] args) {
        // Write a program to find the sum of the series
        //Input: number of terms : 5
        //Output : 1 + 11 + 111 + 1111 + 11111  ; the Sum is : 12345


        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        if(number<0) {
            System.out.println("Invalid input");
        }
        else {
            int i, num = 0, sum = 0;
            for (i = 1; i <= number; i++) {
                num = num * 10 + 1;
                sum += num;
            }
            System.out.println("The sum is: " + sum);
        }
    }
}
