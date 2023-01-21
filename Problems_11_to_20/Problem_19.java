package Problems_11_to_20;

public class Problem_19 {
    public static void main(String[] args) {
        int a=28;
        // a= a + a++ + ++a + --a + a--  =  28+28+30+29+29
        a += a++ + ++a + --a + a-- ;
        System.out.println("The value of a is: " + a);
    }
}
