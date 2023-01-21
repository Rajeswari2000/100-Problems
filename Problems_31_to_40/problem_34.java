package Problems_31_to_40;

import java.util.Scanner;

public class problem_34 {
    public static void main(String[] args) {
        // Calculate the Sum of Natural Numbers and find the largest digit of the sum

        //input: 6
        //sum = 1+2+3+4+5+6 = 21
        //largest digit in the value of sum is 2


        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int i,sum=0,lastDigit=0,number = input.nextInt(),maxDigit=0;

        //finding sum
        for(i=1;i<=number;i++){
            sum+=i;
        }

        System.out.println("The sum is: "+sum);

        //finding the largest digit in the value of the sum
        while(sum>0){
            lastDigit = sum%10;
            sum = sum/10;
            if(maxDigit<lastDigit){
                maxDigit= lastDigit;
            }
        }
        System.out.println("The largest digit in the value of the sum is: "+ maxDigit);
    }
}
