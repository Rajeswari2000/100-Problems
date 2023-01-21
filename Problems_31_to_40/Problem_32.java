package Problems_31_to_40;

import java.util.Scanner;

public class Problem_32 {
    public static void main(String[] args) {
        //check whether a number is positive or negative

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("The number is zero");
            return;
        }

        System.out.println((number>0)?"The number is positive":"The number is negative");
    }
}
