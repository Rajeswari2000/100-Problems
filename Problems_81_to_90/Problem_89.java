package Problems_81_to_90;

import java.util.ArrayList;

public class Problem_89 {
    public static void main(String[] args) {
     //Java Program to convert a sentence/paragraph to word(String) array without using string function

       String str="one two three";
       String result =str+" ";
       String str1="";
        ArrayList <String> AL = new ArrayList<>();
       int i,j=0;
       for(i=0;i<result.length();i++){
           if(result.charAt(i)!=' '){
                str1+=result.charAt(i);
           }
           else if(result.charAt(i)==' '){
               AL.add(str1);
               str1="";
           }
       }

        System.out.println(AL);
    }
}
