package Problems_41_to_50;

import java.util.Arrays;

public class Problem_44 {
    public static void main(String[] args) {
        // print the duplicate elements of an array

        int[] arr = {3,5,2,7,5,4,2,7,3,6,7,2,2,8,8};
        int i;

        Arrays.sort(arr);
        //sorted array:  2 2 2 3 3 4 5 5 6 7 7 7 8 8

        for(i=1;i<arr.length-1;i++) {
            if (arr[i - 1] == arr[i] && arr[i] != arr[i + 1])
                System.out.print(arr[i] + " ");
        }
        System.out.print(arr[i]);
    }
}
