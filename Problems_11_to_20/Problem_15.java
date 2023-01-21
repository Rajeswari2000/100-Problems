package Problems_11_to_20;

import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        //Write a program to find the area of a cylinder

        double area,height,radius;

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = input.nextDouble();
        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        if(height<=0 || radius<=0 ){
            System.out.println("Invalid input");
        }
        else {
            //calculating area
            area = Math.PI * (Math.pow(radius, 2)) * height;
            System.out.printf("Area of the cylinder is: %.2f", area);
        }
    }

}
