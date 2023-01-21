package Problems_71_to_80;

import java.util.Arrays;
import java.util.TreeSet;

public class Problem_72 {
    public static void main(String[] args) {
      //Java Program to remove Duplicate Element in an Array

        //approach 1
      int i,j=0;
      int []arr={2,4,9,7,7,1,0,2,2,1};
      int n=arr.length;
      int[]temp=new int[n];
      Arrays.sort(arr);
        for (i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        for (i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        System.out.println("Approach 1: ");
        for(i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();


        //approach 2

        int k;
        TreeSet <Integer> TS = new TreeSet<>();
        int [] array = {2,4,9,7,7,1,0,2,2,1};
        for(int l: array){
            TS.add(l);
        }
        System.out.println("Approach 2: ");
        System.out.println(TS);
    }
}
