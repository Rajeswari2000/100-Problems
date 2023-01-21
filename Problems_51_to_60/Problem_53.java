package Problems_51_to_60;

import java.util.Scanner;

public class Problem_53 {
    public static void main(String[] args) {
        //input: a13b1c9r10
        //output: aaaaaaaaaaaaabcccccccccrrrrrrrrrr


        //getting input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.next();


        char[] A = str.toCharArray();
        String numStr= "";
        int num=0,i,j;
        char ch =A[0];


        for(i=1;i< A.length;i++){
            if(Character.isDigit(A[i])){    //checking if the character is number or not
                numStr+=A[i] ;
            }
            else{
                num=Integer.parseInt(numStr);  //if the character is not a number
                for(j=1;j<=num;j++){           // print the character before num for num times
                    System.out.print(ch);
                }
                numStr ="";                  //updating numStr
                ch=A[i];                     //ch points the next letter to be printed
            }
        }


        num=Integer.parseInt(numStr);
        for(i=1;i<=num;i++){          //printing the last letter num times
            System.out.print(ch);
        }

    }
}
