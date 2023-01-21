package Problems_51_to_60;

import java.util.Scanner;

public class Problem_57 {
    public static void main(String[] args) {
        //pattern

        //1   5
        // 2 4
        //  3
        // 2 4
        //1   5

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        int n=str.length();

        for (int i=0, j=n-1; i<n ; i++, j--) {
            for (int print=0; print<n; print++) {
                if (print == i) {
                    System.out.print(str.charAt(i));
                } else if (print == j) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
