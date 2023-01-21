package Problems_61_to_70;

import java.util.Arrays;

public class Problem_69 {
    public static void main(String[] args) {
       //Java Program to rotate the elements of an array in the right direction

        int[]arr={7,3,9,1,4,2};
        int i;
        int temp=arr[arr.length-1];
        for(i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
