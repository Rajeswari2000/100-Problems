package Problems_1_to_10;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        //pattern

//        Input: 12345
//        Output:
//        1   1
//         2 2
//          3
//         4 4
//        5   5

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
                    System.out.print(str.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
