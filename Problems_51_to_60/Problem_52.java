package Problems_51_to_60;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_52 {
    public static void main(String[] args) {
        //Using Recursion reverse the string

        //getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = input.nextLine();

        String []arr=st.split(" ");
        int s=0,e=arr.length-1;

        //function call
        reverseSentence(arr,s,e);

        System.out.println(Arrays.toString(arr));
    }

    static String[] reverseSentence(String[]array, int s, int e){
        String temp;

        //base case
        if(s>e){
            return array;
        }

        //swapping
        temp=array[s];
        array[s]=array[e];
        array[e]=temp;

        //recursive function call
        reverseSentence(array,s+1,e-1);
        return array;
    }

}
