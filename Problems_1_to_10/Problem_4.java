package Problems_1_to_10;

public class Problem_4 {
    public static void main(String[] args) {
           //functionality of a Bitwise operators

        int a=5,b=7;
        System.out.println("a|b  = "+ (a|b));    //  bitwise OR    (0101)|(0111) = 0111
        System.out.println("a&b  = "+ (a&b));    //  bitwise AND   (0101)&(0111) = 0101
        System.out.println("~a = "+(~a));        //  bitwise Complement  ~(0101) = 1010
        System.out.println("a^b = "+(a^b));      //  bitwise XOR   (0101)^(0111) = 0010
    }
}
