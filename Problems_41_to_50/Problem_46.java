package Problems_41_to_50;

import java.util.Arrays;

public class Problem_46 {
    public static void main(String[] args) {
        // rotate the elements of an array in the right direction

        int i,j;
        int[] arr={4,7,9,3,9,2,5,0,8};
        j=arr[arr.length-1];

        for(i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=j;

        System.out.println(Arrays.toString(arr));
    }
}
