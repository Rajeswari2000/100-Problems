package Problems_61_to_70;

import java.util.Arrays;

public class Problem_61 {
    public static void main(String[] args) {
        //Java Program to print the elements of an array in reverse order


        // 1st approach
        int i;
        int[]arr = {2,4,6,7,8};
        int[]temp = arr.clone();
        int j = arr.length-1;

        for(i=0;i<arr.length;i++){
            arr[i]=temp[j--];
        }

        System.out.println(Arrays.toString(arr));


        // 2nd approach

        int [] arr1 = {4,5,6,7,9};
        int k,l=arr1.length-1,temp1;

         for(k=0;k<arr1.length/2;k++){
             temp1=arr1[k];
             arr1[k]=arr1[l];
             arr1[l]=temp1;
             l--;
         }

        System.out.println(Arrays.toString(arr1));


    }
}
