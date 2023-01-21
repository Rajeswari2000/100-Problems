package Problems_21_to_30;

import java.util.Scanner;

public class Problem_28 {
    public static void main(String[] args) {
        //Check Whether a Number is Even or Odd

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String answer = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: "+answer);

    }
}
