package Problems_91_to_100;

public class Problem_99 {
    public static void main(String[] args) {
     //Java Program to convert all small letters to capital letters without using special functions

        String str = "hello";
        String ans="";
        for(int i=0;i<str.length();i++){
              ans=(ans+(char)(str.charAt(i)-(32)));

        }
        System.out.println(ans);

    }
}
