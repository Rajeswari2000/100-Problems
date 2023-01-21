package Problems_81_to_90;

public class Problem_83 {

    //approach 1

    public static void main(String[] args) {

        //Java Program to display the upper triangular matrix

        int i,j;
        int[][]mat={{2,3,4},{9,1,5},{3,2,7}};

        int m=mat.length,n=mat[0].length;
        if(m!=n){
            System.out.println("Invalid matrix");
        }
        else{
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    if(i>j){
                        System.out.print(0+" ");
                    }
                    else{
                        System.out.print(mat[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }


    //approach 2  ---> using recursion

//    public static void main(String[] args) {
//        int[][]mat1={{2,3,4},{9,1,5},{3,2,7}};
//        int m1=mat1.length,n1=mat1[0].length;
//        int i=0,j=0;
//       displayUpperTriangularMat(mat1,m1,n1,i,j);
//
//
//    }
//
//    public static void displayUpperTriangularMat(int[][]mat1,int m1,int n1,int i,int j){
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
//                if(i>j){
//                    System.out.print(0+" ");
//                }
//                else{
//                    System.out.print(mat1[i][j]+" ");
//                }
//                j++;
//                displayUpperTriangularMat(mat1,m1,n1,i,j);
//            }
//        }
//        return;
//    }
}
