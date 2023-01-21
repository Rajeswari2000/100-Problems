package Problems_11_to_20;

public class problem_20 {
    public static void main(String[] args) {

        int x = 2;

        x = x++ * 2 + 3 * --x ;
        // x = 2 * 2 + 3 * 2 = 10
        System.out.println("The value of x is: "+ x );
    }
}
