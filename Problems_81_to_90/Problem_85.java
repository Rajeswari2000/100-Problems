package Problems_81_to_90;

public class Problem_85 {
    public static void main(String[] args) {
         //Java Program to find the sum of each row and each column of a matrix

        int[][] mat = {{1,4,8},{4,0,1},{5,9,3}};
        int m= mat.length, n=mat[0].length;
        int i,j,sum_row=0,sum_column=0;

        //to find the sum of each row
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                sum_row+=mat[i][j];
            }
            System.out.println("Sum of row "+ (i+1) +": "+ sum_row);
            sum_row=0;
        }

        System.out.println();

        //to find the sum of each column
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                sum_column+=mat[j][i];
            }
            System.out.println("Sum of column "+ (i+1) +": "+ sum_column);
            sum_column=0;
        }

    }
}
