package Problems_21_to_30;

import java.util.Scanner;

public class Problem_25 {
    public static void main(String[] args) {
        //find quotient and remainder

        int dividend,divisor,quotient,remainder;

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of the dividend: ");
        dividend = input.nextInt();
        System.out.print("Enter the value of the divisor: ");
        divisor = input.nextInt();

        //calculate quotient and remainder
        quotient = dividend/divisor;
        remainder = dividend%divisor;
        System.out.println("The quotient is: "+ quotient+ "\nThe remainder is: "+ remainder);
    }
}
