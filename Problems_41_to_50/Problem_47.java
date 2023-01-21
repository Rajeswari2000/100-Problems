package Problems_41_to_50;

import java.util.Scanner;

public class Problem_47 {
    public static void main(String[] args) {
        //pattern

        // for n=9
//                        1
//                      1 2 1
//                    1 2 3 2 1
//                  1 2 3 4 3 2 1
//                1 2 3 4 5 4 3 2 1
//              1 2 3 4 5 6 5 4 3 2 1
//            1 2 3 4 5 6 7 6 5 4 3 2 1
//          1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
//        1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

        int i,j;

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows to be printed: ");
        int n = input.nextInt();

        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
