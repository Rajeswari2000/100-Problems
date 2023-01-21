package Problems_21_to_30;

public class Problem_21 {
    public static void main(String[] args) {

        //If int y = 10 then find int z = (++y * (y++ + 5))
        int y = 10,z;

        z = (++y * (y++ + 5));
        // z = (11 * (11+5)) = 11 * 16 = 176

        System.out.println("The value of z is: "+ z );
    }
}
