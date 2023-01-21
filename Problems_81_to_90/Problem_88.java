package Problems_81_to_90;

public class Problem_88 {
    public static void main(String[] args) {
      //Java Program to convert a sentence/paragraph to word(String) array using string function

        String string="one two three";
        String[]arr=string.split(" ");

        for(String i:arr){
            System.out.print(i+" ");
        }
    }
}
