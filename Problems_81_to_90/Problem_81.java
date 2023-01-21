package Problems_81_to_90;

public class Problem_81 {
    public static void main(String[] args) {
        //Java Program to determine whether two matrices are equal

         //appraoch 1

        int [][]mat={{1,0,0},{0,6,0},{1,0,0}};
        int [][]mat1={{1,0,0},{0,6,0},{1,0,0}};
        //int [][]mat1={{2,3,4},{5,7,1},{9,0,1}};
        int m=mat.length,n=mat[0].length;
        int m1= mat1.length,n1=mat1[0].length;

        boolean ans= isEqual(mat,m,n,mat1,m1,n1);

        System.out.println(ans);


    }
    public static boolean isEqual(int[][]mat,int m,int n,int[][]mat1,int m1, int n1){
        int i,j,count=0;

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]!=mat1[i][j]){
                   return false;
                }
            }
        }
        return true;
    }


    //approach 2 ---> using recursion


//    public static void main(String[] args) {
//        int[][]mat1={{2,6},{5,8}};
//        //int[][]mat2={{3,8},{0,2}};
//        int[][]mat2={{2,6},{5,8}};
//        int m1=mat1.length,n1=mat1[0].length,m2= mat2.length,n2=mat2[0].length;
//        int i=0,j=0;
//        boolean answer=true;
//        boolean ans = isMat(mat1,mat2,m1,n1,m2,n2,i,j,answer);
//
//        if(ans==true){
//            System.out.println("The matrices are equal");
//        }
//        else{
//            System.out.println("The matrices are not equal");
//        }
//
//
//
//    }
//
//    public static boolean isMat(int[][]mat1,int[][]mat2,int m1,int n1,int m2,int n2,int i,int j,boolean answer){
//
//        if(i>=m1){
//            return true;
//        }
//        if(j>=n1){
//            j=0;i++;
//        }
//        if(i<m1){
//            if(j<n1){
//                if(mat1[i][j]!=mat2[i][j]){
//                    answer=false;
//                }
//                j++;
//                isMat(mat1,mat2,m1,n1,m2,n2,i,j,answer);
//            }
//        }
//        return answer;
//    }
}
