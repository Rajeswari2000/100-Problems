package Problems_71_to_80;

public class Problem_79 {
    public static void main(String[] args) {
        //Java Program to determine whether a given matrix is an identity matrix

        //int [][]mat = {{1,2,3},{4,5,6},{7,8,9}}    ;
        int [][]mat = {{1,0,0},{0,1,0},{0,0,1}}    ;
        int m = mat.length,n=mat[0].length;
        boolean ans = isIdentity(mat,n,m);

        System.out.println(ans);
    }

    public static boolean isIdentity(int[][]mat,int n,int m){
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==j && mat[i][j]!=1)
                    return false;
                else if(i!=j && mat[i][j]!=0)
                    return false;
            }
        }
        return true;
    }
}
