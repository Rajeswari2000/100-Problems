package Problems_51_to_60;

import java.util.Scanner;

public class Problem_58 {
    public static void main(String[] args) {
        //pattern

        //for input = 4
        //********
        //***__***
        //**____**
        //*______*
        //**____**
        //***__***
        //********

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int m = input.nextInt();

        int n=m*2;
        int i,j,num,un=2,st=n/2;

        for(i=1;i<n;i++) {
            for (j = 1; j <= st; j++) {
                System.out.print("*");
            }
            if (i > 1 && i < n - 1) {
                for (j = 1; j <= un; j++) {
                    System.out.print("_");
                }
                if (i < n / 2) un += 2;
                else un -= 2;
            }
            for (j = 1; j <= st; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n / 2) st -= 1;
            else st += 1;
        }
    }
}

