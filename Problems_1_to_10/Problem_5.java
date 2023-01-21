package Problems_1_to_10;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        //pattern

        //Input: E

        //Output:
        // EEEEE
        // DDDD
        // CCC
        // BB
        // A

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch =input.next().charAt(0);

        char i,j ;

        //uppercase
        if(ch>=65 && ch<=90) {
            for (i = ch; i >= 65; i--) {
                for (j = i; j >= 65; j--) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }

        //lowercase
        else if(ch>=97 && ch<=122){
            for (i = ch; i >= 97; i--) {
                for (j = i; j >= 97; j--) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }

        else{
            System.out.println("Invalid input");
        }
    }
}
