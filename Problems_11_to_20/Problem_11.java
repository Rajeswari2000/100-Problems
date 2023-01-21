package Problems_11_to_20;

public class Problem_11 {

    //program to left rotate the elements of a 2D array
    //using extra spaces

    public static void main(String[] args) {

        //given matrix
        int[][]matrix={{1,2,3},{4,5,6},{7,8,9},{4,6,9}};

        //function call to rotate the matrix 90 degree clockwise (right rotate)
        //int[][]rightRotatedMatrix = rightRotate(matrix);

        //function call to rotate the matrix 90 degree anti-clockwise (left rotate)
        int[][]leftRotatedMatrix=leftRotate(matrix);

        System.out.println("The original matrix is: ");
        printMatrix(matrix);

        System.out.println("The left rotated matrix is: ");
        printMatrix(leftRotatedMatrix);

//        System.out.println("The right rotated matrix is: ");
//        printMatrix(rightRotatedMatrix);
    }

    //90 degree anti-clockwise or left rotate
    public static int[][] leftRotate(int[][]matrix){
        int[][]LrotateMat=new int[matrix[0].length][matrix.length];
        int i,j;
        for(i=0;i<matrix[0].length;i++){
            for(j=0;j<matrix.length;j++){
                LrotateMat[i][j]=matrix[j][matrix[0].length-1-i];
            }
        }
        return LrotateMat;
    }


    //90 degree clockwise or right rotate

//    public static int[][] rightRotate(int [][]matrix){
//        int[][]R_rotateMat = new int[matrix[0].length][matrix.length];
//        int i,j;
//        for(i=0;i<matrix[0].length;i++){
//            for(j=0;j< matrix.length;j++){
//                R_rotateMat[i][j]=matrix[matrix.length-1-j][i];
//            }
//        }
//        return R_rotateMat;
//    }


    //printing the matrix
    public static void printMatrix(int[][] matrix){
        int i,j;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
