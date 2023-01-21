package Problems_61_to_70;

import java.util.Arrays;

public class Problem_67 {
    public static void main(String[] args) {
       //Java Program to print the duplicate elements of an array

        int i;
        int[]arr={3,2,2,6,7,7};
        Arrays.sort(arr);
        //2 2 3 6 7 7 7
        for(i=1;i<arr.length-1;i++){
            if(arr[i-1]==arr[i] && arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
            }
        }

        if(arr[i-1]==arr[i]){
            System.out.println(arr[i-1]);
        }
    }
}
