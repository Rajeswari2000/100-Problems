package Problems_51_to_60;

import java.util.Scanner;

public class Problem_59 {
    public static void main(String[] args) {
        // Input:   String 1: test123string
        //          String 2: 123
        //          Output: 4

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String string1 = input.nextLine();
        System.out.println("Enter string2: ");
        String string2 = input.nextLine();

        int index = isSubstring(string1, string2);
        System.out.println(index);
    }

    public static int isSubstring(String string1,String string2){
            int n = string1.length();
            int m = string2.length();
            int d = n-m,i,j;
            int index = -1;
            for(i=0;i<=d;i++){
               for(j=0;j<m;j++) {
                   if (string1.charAt(i + j) != string2.charAt(j)) {
                       break;
                   }
                   if (j == m - 1) {
                       return i;
                   }
               }
            }
            return index;
    }
}

