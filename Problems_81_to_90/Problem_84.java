package Problems_81_to_90;

public class Problem_84 {

    // Function to compute frequency of odd/even numbers
    public static void findFreqOfEvenOdd(int[][] arr, int m, int n) {
        // Initializing the counter variables
        int count_even = 0, count_odd = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0) {
                    count_even++;
                }
                else {
                    count_odd++;
                }
            }
        }
        System.out.println("Odd Number Frequency: " + count_odd);
        System.out.println("Even Number Frequency: "+ count_even);
    }

    public static void main(String[] args) {
        int[][] mat = {{1,4,8},{4,0,1},{5,9,3}};
        int m= mat.length,n=mat[0].length;
        findFreqOfEvenOdd(mat, m, n);
    }
}
