package Problems_91_to_100;

public class Problem_95 {
    public static void main(String[] args) {
      //Java Program to find if the given two strings are palindrome
        String str1 = "malayalam";
        String str2 = "malayalam";

        //approach 1 function call
        approach1ReversingString2(str1,str2);

        boolean ans = CheckingForEveryCharacter(str1,str2);
        System.out.println("Output of approach2: ");
        System.out.println(ans);


    }


    //approach 1
    public static void approach1ReversingString2(String str1,String str2){
        String str="";
        int i;
        for(i=str2.length()-1;i>=0;i--){
            str+=str2.charAt(i);
        }

        System.out.println("Output of approach1: ");
        if(str1.equals(str)){
            System.out.println("The given two strings are palindrome");
        }
        else{
            System.out.println("The given two strings are not palindrome");
        }
    }


    //approach 2

    public static boolean CheckingForEveryCharacter(String str1,String str2){
        int i;
        for(i=0;i<Math.min(str1.length(),str2.length());i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
