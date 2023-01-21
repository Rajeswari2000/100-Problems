package Problems_71_to_80;

public class Problem_76 {
    public static void main(String[] args) {
      //Java Program to display the transpose matrix

        int i,j;
        int [][]mat={{1,2,3},{5,6,8},{2,8,4},{3,9,0}};
        int [][]mat_transpose=new int[mat[0].length][mat.length];

        for(i=0;i<mat[0].length;i++){
            for(j=0;j<mat.length;j++){
                if(i==j) {
                    mat_transpose[i][j] = mat[i][j];
                }
                else{
                    mat_transpose[i][j]=mat[j][i];
                }
            }
        }

        System.out.println("Original Matrix: ");
        for(i=0;i<mat.length;i++){
            for(j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix transpose: ");
        for(i=0;i<mat[0].length;i++){
            for(j=0;j<mat.length;j++){
                System.out.print(mat_transpose[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }



    //approach 2 ---> using recursion

//    public static void main(String[] args) {
//        int[][]mat1={{2,3,4},{9,1,5},{3,2,7}};
//        int m1=mat1.length,n1=mat1[0].length;
//        int i=0,j=0;
//
//        System.out.println("Original matrix: ");
//
//        for(i=0;i<m1;i++){
//            for(j=0;j<n1;j++){
//                System.out.print(mat1[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        i=0;j=0;
//
//        System.out.println("Matrix transpose: ");
//
//        //function call to perform matrix transpose
//        performMatrixTranspose(mat1,m1,n1,i,j);
//
//    }
//
//    public static void performMatrixTranspose(int[][]mat1,int m1,int n1,int i,int j){
//
//        if(i>=m1){
//            return ;
//        }
//        if(j>=n1){
//            j=0;i++;
//            System.out.println();
//        }
//
//        if(i<m1){
//            if(j<n1){
//                if(i==j) {
//                    System.out.print(mat1[i][j]+" ");
//                }
//                else{
//                    System.out.print(mat1[j][i]+" ");
//                }
//                j++;
//                performMatrixTranspose(mat1,m1,n1,i,j);
//            }
//        }
//    }

}
