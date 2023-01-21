package Problems_71_to_80;

import java.util.Scanner;

public class Problem_74 {
    public static void main(String[] args) {
        //Java Program to find the product of two matrices


        //getting the no.of rows and columns as input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix 1: ");
        int rows_m1 = input.nextInt();
        System.out.println("Enter the number of columns of matrix : ");
        int columns_n1 = input.nextInt();

        System.out.println("Enter the number of rows of matrix 1: ");
        int rows_m2 = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns_n2 = input.nextInt();

        int [][]mat1 = new int[rows_m1][columns_n1];
        int [][]mat2 = new int[rows_m2][columns_n2];
        int [][]mat3 = new int[rows_m1][columns_n2];
        int i,j,k;

        //getting input for matrix 1
        System.out.println("Enter the values of matrix 1: ");
        for(i=0;i<rows_m1;i++){
            for(j=0;j<columns_n1;j++){
                mat1[i][j]=input.nextInt();
            }
        }

        //getting input for matrix 2
        System.out.println("Enter the values of matrix 2: ");
        for(i=0;i<rows_m2;i++){
            for(j=0;j<columns_n2;j++){
                mat2[i][j]=input.nextInt();
            }
        }


        //calculating the product : mat3 = mat1 * mat2
        for(i=0;i<rows_m1;i++){
            for(j=0;j<columns_n2;j++) {
                for (k = 0; k < columns_n1; k++){
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println();


        //printing the matrices 1 , 2 and 3

        System.out.println("Matrix 1: ");
        for(i=0;i<rows_m1;i++){
            for(j=0;j<columns_n1;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix 2: ");
        for(i=0;i<rows_m2;i++){
            for(j=0;j<columns_n2;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix 3: ");
        for(i=0;i<rows_m1;i++){
            for(j=0;j<columns_n2;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
