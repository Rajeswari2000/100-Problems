package Problems_41_to_50;

import java.util.Arrays;

public class Problem_41 {
    public static void main(String[] args) {
        //copy all elements of one array into another array

        int[] arr={4,7,23,76,45,0,7,3};
        int i;
        int[] newArray = new int[arr.length];

        for(i=0;i<arr.length;i++){
            newArray[i]=arr[i];
        }

        System.out.println(Arrays.toString(newArray));

        //aliter
        //int[] newArr = arr.clone();
        //System.out.println(Arrays.toString(newArr));
    }
}
