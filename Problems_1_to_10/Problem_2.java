package Problems_1_to_10;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        //Write a program to print a letters from the user input character to 'Z' without using strings.
        // Input : X
        // Output : XYZ

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = input.next().charAt(0);

        char i;

        //uppercase
        if(ch>=65 && ch<=90) {
            for (i = ch; i <= 'Z'; i++) {
                System.out.print(i);
            }
        }

        //lowercase
        else if(ch>=97 && ch<=122){
            for(i=ch;i<='z';i++){
                System.out.print(i);
            }
        }

        else{
            System.out.println("Invalid Input");
        }
    }
}
