package Problems_41_to_50;

import java.util.Scanner;

public class Problem_48 {
    public static void main(String[] args) {
        //pattern

        //for n=9
//                        9
//                      8 9 8
//                    7 8 9 8 7
//                  6 7 8 9 8 7 6
//                5 6 7 8 9 8 7 6 5
//              4 5 6 7 8 9 8 7 6 5 4
//            3 4 5 6 7 8 9 8 7 6 5 4 3
//          2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
//        1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
//
        //getting input
        Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows to be printed: ");
      int n = input.nextInt();
      int i,j;
      for(i=n;i>=1;i--){
         for(j=1;j<=i;j++){
            System.out.print("  ");
         }
         for(j=i;j<=n;j++){
             System.out.print(j+" ");
         }
         for(j=n-1;j>=i;j--){
             System.out.print(j+" ");
         }
          System.out.println();
      }
    }
}
