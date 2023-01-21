package Problems_11_to_20;

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {

        //finding the roots of a quadratic equation

        double a,b,c,d,root1,root2,imag;

        //getting input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a=input.nextDouble();
        System.out.print("Enter the value of b: ");
        b=input.nextDouble();
        System.out.print("Enter the value of c: ");
        c=input.nextDouble();

        //defining d
        d=(b*b)-(4*a*c);

        if(d>0){
            root1=((-b)+Math.sqrt(d))/(2*a) ;
            root2 =((-b)-Math.sqrt(d))/(2*a) ;
            System.out.printf("root1: %.2f  root2: %.2f\n",root1,root2);
        }
        else if(d==0){
            root1=(-b)/(2*a);
            System.out.printf("root1 = root2 = %.2f",root1);
        }
        else if(d<0){
            root1=(-b)/(2*a);
            imag =  Math.sqrt(-d)/(2*a) ;
            System.out.printf("root1: %.2f + i(%.2f)  root2: %.2f - i(%.2f)\n",root1,imag,root1,imag);
        }
    }
}
