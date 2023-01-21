package Problems_21_to_30;

public class Problem_26 {
    public static void main(String[] args) {
       //The int keyword is a data type that can store whole numbers from -2147483648 to 2147483647.
        // and the long keyword is a data type that can store whole numbers from -9223372036854775808 to 9223372036854775808.

        int num = 1000000*1000000;
        System.out.printf("Numeric overflow due to the usage of int data type:  1000000 x 1000000 = %d\n",num);

        long num1=1000000*1000000L;
        System.out.printf("Using long data type we get the correct answer:  1000000 x 1000000 = %d",num1);
    }
}
