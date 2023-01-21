package Problems_61_to_70;

import java.util.Arrays;

public class Problem_66 {
    public static void main(String[] args) {
       //Java Program to left rotate the elements of an array
        int i;
        int[]arr={5,3,9,2,8};
        int temp=arr[0];
        for(i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
