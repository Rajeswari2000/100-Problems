package Problems_51_to_60;

import java.util.Scanner;

public class Problem_56 {
    public static void main(String[] args) {
        //pattern

        //for input = 10
        //    1
        //   2 3
        //  4 5 6
        // 7 8 9 10

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=input.nextInt();
        int i,j,k=1,num=0;

        while (number > 0) {
            num++;
            number -= num;
        }

        for(i=1;i<=num;i++){
            for(j=i;j<=num;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
