package Problems_21_to_30;

import java.util.Scanner;

public class Problem_24 {
    public static void main(String[] args) {
        //Find ASCII Value of a Character

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char char_input = input.next().charAt(0);

        System.out.println("The ascii value of the character " + char_input + " is: " + (int) char_input);
    }
}
