package Problems_11_to_20;

import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {

        double radius_outer,radius_inner,area_outer,area_inner,difference;

        //getting input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of inner radius: ");
        radius_inner = input.nextDouble();
        System.out.print("Enter the value of outer radius: ");
        radius_outer = input.nextDouble();

        area_inner=(Math.PI)*Math.pow(radius_inner,2);
        area_outer=(Math.PI)*Math.pow(radius_outer,2);
        difference = area_outer - area_inner ;

        System.out.printf("Area of the space between the two concentric circles:  %.2f",difference);
    }
}
