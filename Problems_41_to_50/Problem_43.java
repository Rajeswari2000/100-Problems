package Problems_41_to_50;

import java.util.Arrays;

public class Problem_43 {
    public static void main(String[] args) {
        //left rotate the elements of an array

        int i,j;
        int[] arr={4,7,9,3,9,2,5,0,8};

        j=arr[0];

        for(i=0;i<arr.length -1;i++){
            arr[i]=arr[i+1];
        }

        arr[i]=j;

        System.out.println(Arrays.toString(arr));
    }
}
