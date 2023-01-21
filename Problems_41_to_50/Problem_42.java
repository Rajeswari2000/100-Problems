package Problems_41_to_50;

import java.util.Arrays;

public class Problem_42 {
    public static void main(String[] args) {
        //find the frequency of each element in the array

        //1st approach

        //time complexity ---> O(nlogn)

        int[] array = {2,45,6,87,43,6,28,6,5,45,87,2};
        int i,count=1;

        Arrays.sort(array);
        //sorted array: 2 2 5 6 6 6 28 43 45 45 87 87

        for(i=0;i<array.length-1;i++){
            if(array[i]==array[i+1]){
                count++;
            }
            else {
                System.out.println(array[i]+" occurs "+count+" times.");
                count=1;
            }
        }
        System.out.println(array[i]+" occurs "+count+" times.");
        System.out.println();


        //2nd approach

        //time complexity ---> O(n)

//        int[] arr= {2,45,6,87,43,6,28,6,5,45,87,2};
//        int [] freq = new int [101];
//
//        for(i=0;i<arr.length;i++){
//            freq[arr[i]]++;
//        }
//        for(i=0;i<freq.length;i++){
//            if(freq[i]!=0){
//                System.out.println(i+" occurs "+freq[i]+" times.");
//            }
//        }
    }
}
