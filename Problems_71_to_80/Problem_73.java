package Problems_71_to_80;

import java.util.Scanner;

public class Problem_73 {
    public static void main(String[] args) {
        //Java Program to add two matrices

        //getting the no.of rows and columns as input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows_m = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns_n = input.nextInt();

        int [][]mat1 = new int[rows_m][columns_n];
        int [][]mat2 = new int[rows_m][columns_n];
        int [][]mat3 = new int[rows_m][columns_n];
        int i,j;

        //getting input for matrix 1
        System.out.println("Enter the values of matrix 1: ");
        for(i=0;i<rows_m;i++){
            for(j=0;j<columns_n;j++){
                mat1[i][j]=input.nextInt();
            }
        }

        //getting input for matrix 2
        System.out.println("Enter the values of matrix 2: ");
        for(i=0;i<rows_m;i++){
            for(j=0;j<columns_n;j++){
                mat2[i][j]=input.nextInt();
            }
        }


        //calculating the sum : mat3 = mat1 + mat2
        for(i=0;i<rows_m;i++){
            for(j=0;j<columns_n;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println();


        //printing the matrices 1 , 2 and 3

        System.out.println("Matrix 1: ");
        for(i=0;i<rows_m;i++){
            for(j=0;j<columns_n;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix 2: ");
        for(i=0;i<rows_m;i++){
            for(j=0;j<columns_n;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix 3: ");
        for(i=0;i<rows_m;i++){
            for(j=0;j<columns_n;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }

    }


    //approach 2
//    public static void main(String[] args) {
//        int[][]mat1={{2,6,7},{5,8,5}};
//        int[][]mat2={{3,8,1},{0,2,5}};
//        int m1=mat1.length,n1=mat1[0].length,m2= mat2.length,n2=mat2[0].length;
//        int[][]mat3=new int[m1][n1];
//        int i=0,j=0;
//        int ans=addMat(mat1,mat2,mat3,m1,n1,m2,n2,i,j);
//
//        for(i=0;i<m1;i++){
//            for(j=0;j<n1;j++){
//                System.out.print(mat3[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static int addMat(int[][]mat1,int[][]mat2,int[][]mat3,int m1,int n1,int m2,int n2,int i,int j){
//
//        if(i>=m1){
//            return 0;
//        }
//        if(j>=n1){
//            j=0;i++;
//        }
//        if(i<m1){
//            if(j<n1){
//                mat3[i][j]=mat1[i][j]+mat2[i][j];
//                j++;
//                addMat(mat1,mat2,mat3,m1,n1,m2,n2,i,j);
//            }
//        }
//        return 0;
//    }
}
