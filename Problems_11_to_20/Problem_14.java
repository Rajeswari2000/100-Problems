package Problems_11_to_20;

import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        //Write a program to find the area of the rectangle

        double area,length,breadth;

        //getting input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of the length of the rectangle: ");
        length = input.nextDouble();
        System.out.print("Enter the value of the breadth of the rectangle: ");
        breadth = input.nextDouble();

        if(length<=0 || breadth<=0 ){
            System.out.println("Invalid input");
        }
        else {
            //finding area
            area = length * breadth;
            System.out.printf("Area of the rectangle is: %.2f", area);
        }
    }
}
