package Problems_1_to_10;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        //Write a single program to generate a multiplication and subtraction table for a given number

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Enter the size of the table: ");
        int size = input.nextInt();

        int i, mul, sub;

        //multiplication table
        System.out.println("\nThe multiplication table for " + num + " is: ");
        for (i = 1; i <= size; i++) {
            mul = num * i;
            System.out.printf("%d x %d = %d\n",num,i,mul);
        }

        //subtraction table
        System.out.println("\nThe subtraction table for " + num + " is: ");
        for (i = num; i <= num + size; i++) {
            sub = i - num;
            System.out.printf("%d - %d = %d\n",i,num,sub);
        }
    }

}
