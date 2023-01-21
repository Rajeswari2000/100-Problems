package Problems_91_to_100;

import java.util.Arrays;

public class Problem_94 {
    public static void main(String[] args) {
        //Java Program to find the given two strings are anagram to each other

        //approach 1

        String str1="rock";
        String str2="cork";
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean ans=isEqualApproach1(ch1,ch2);
        System.out.println("Approach 1: ");
        if(ans){
            System.out.println("The two strings are anagrams");
        }
        else if(!ans){
            System.out.println("The two strings are not anagrams");
        }


        //output for 2nd approach
        System.out.println("Approach 2: ");
        boolean ans1 = isAnagram(str1,str2);
        if(ans1){
            System.out.println("The two strings are anagrams");
        }
        else if(!ans1){
            System.out.println("The two strings are not anagrams");
        }

    }

    public static boolean isEqualApproach1(char[]ch1,char[]ch2){
        int i=0;
        if(ch1[i]!=ch2[i])return false;

        return true;
    }

    //approach 2

    public static boolean isAnagram(String str1,String str2) {

        int []freq1=new int[25];
        int []freq2=new int[25];
        int i;

        for(i=0;i<str1.length();i++){
           freq1[str1.charAt(i)-'a'] ++;
        }

        for(i=0;i<str2.length();i++){
            freq2[str2.charAt(i)-'a'] ++;
        }

        boolean ans2 = isEqualApproach2(freq1,freq2);
         if(ans2) return true;

         return false;
    }

    public static boolean isEqualApproach2(int[]freq1,int[]freq2){
        int i;

        for(i=0;i<freq1.length;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
