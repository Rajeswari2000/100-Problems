package Problems_31_to_40;

import java.util.Scanner;

public class Problem_33 {
    public static void main(String[] args) {
    //Check whether a character is an alphabet or not

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char input_char = input.next().charAt(0);

        if((input_char>=97 && input_char<=122) || (input_char>=65 && input_char<=90)){
            System.out.println("The character is an alphabet");
        }
        else{
            System.out.println("The character is not an alphabet");
        }

    }
}
