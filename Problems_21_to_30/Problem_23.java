package Problems_21_to_30;

public class Problem_23 {
    public static void main(String[] args) {

        //What is the value of x1 if x=5  and  x1 = ++x – x++ + –x

        int x= 5,x1;

        x1 = ++x - x++ + --x ;
        // x1 = 6-6+6 = 6

        System.out.println("The value of x1 is: "+ x1);

    }
}
