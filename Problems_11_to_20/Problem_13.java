package Problems_11_to_20;

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        //Write a program to find the area of the square

        double area,side;

        //getting input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of the side of the square: ");
        side = input.nextDouble();

        if(side<=0){
            System.out.println("Inavlid input");
        }
        else {
            area = Math.pow(side, 2);
            System.out.printf("Area of the square is: %.2f", area);
        }
    }
}
