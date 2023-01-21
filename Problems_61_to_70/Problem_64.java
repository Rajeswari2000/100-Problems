package Problems_61_to_70;

import java.util.Arrays;

public class Problem_64 {
    public static void main(String[] args) {

        //Java Program to copy all elements of one array into another array

       int i;
       int[]arr={3,5,6,7,8,9};
       int[]copy_arr=new int[arr.length];
       for(i=0;i<arr.length;i++){
           copy_arr[i]=arr[i];
       }
        System.out.println(Arrays.toString(copy_arr));
    }
}
