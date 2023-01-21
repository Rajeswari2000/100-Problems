package Problems_71_to_80;

public class Problem_80 {
    public static void main(String[] args) {
        //Java Program to determine whether a given matrix is a sparse matrix

        int i,j,count=0;
        int [][]mat={{1,0,0},{0,6,0},{1,0,0}};
        int m=mat.length,n=mat[0].length;

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]==0){
                    count++;
                }
            }
        }

        if(count>(m*n)/2){
            System.out.println("The given matrix is a sparse matrix ");
        }
        else {
            System.out.println("The given matrix is not a sparse matrix");
        }
    }


}
