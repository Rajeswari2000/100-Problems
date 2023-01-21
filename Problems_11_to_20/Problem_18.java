package Problems_11_to_20;

public class Problem_18 {
    public static void main(String[] args) {

        int a=2,b=3;

        // i) ++a-b–-
        // a = 2 , b = 3 ;  ++a = 3  ;  b-- = 3 ; ++a-b-- = 3-3=0

        System.out.println("i)   ++a-b-- => " + (++a-b--));


        //ii)a%b++
        // b++ = 3 ; a%b++ = 2%3 = 2;

        a=2;b=3;
        System.out.println("ii)  a%b++ => " + a%b++);


        //iii)a*=b+5
        // a*=b+5 = a = a*(b+5) = 2*(3+5) = 2*8 = 16

        a=2;b=3;
        System.out.println("iii) a*=b+5 => "+ (a*=b+5));


        //iv)x=69>>>2

        // binary of 69 1000101
        // after right shifting 2 times it becomes 0010001
        // decimal value of 0010001 is 17

        int x;
        System.out.println("iv)  x=69>>>2 => "+ (69>>>2));

    }
}
