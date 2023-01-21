package Problems_21_to_30;

import java.util.Scanner;

public class Problem_29 {
    public static void main(String[] args) {
        // Check Whether a Character is a Vowel or Consonant

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().toLowerCase().charAt(0);

        if(ch<97 || ch>122){
            System.out.println("Not an alphabet");
            return;
        }
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u'){
            System.out.println("The character is a vowel");
        }
        else{
            System.out.println("The character is a consonant ");
        }

    }
}
