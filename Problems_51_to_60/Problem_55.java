package Problems_51_to_60;

import java.util.Scanner;

public class Problem_55 {
    public static void main(String[] args) {

         //for n=4

         //****
         //*
         //*
         //****

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=input.nextInt();

        int i,j;

        for(i=0;i<number;i++){
            if(i==0 || i==number-1) {
                for (j = 0; j < number; j++) {
                    System.out.print("*");
                }
            }
            else{
                for(int k=0;k<1;k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
