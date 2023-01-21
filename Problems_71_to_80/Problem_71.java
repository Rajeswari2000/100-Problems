package Problems_71_to_80;

import java.util.Arrays;

public class Problem_71 {
    public static void main(String[] args) {
       //Java Program to find the 2nd Smallest Number in an Array


        //1st approach

        int k=2;
        int[]arr={100,-45,4,2,6,-9,76,89,-23,1};
        Arrays.sort(arr);
        int secondMinimum= arr[k-1];
        System.out.println("Second minimum : "+secondMinimum);



        //2nd approach

        int l,m,min=Integer.MAX_VALUE,second_minimum=Integer.MAX_VALUE;
        int [] arr1={2,-41,1,7,-5,9,0,-225};

        for(l=0;l<arr1.length;l++){
           if(arr1[l]<min){
               min=arr1[l];
           }
        }

        for(m=0;m<arr1.length;m++){
            if(arr1[m]<second_minimum && arr1[m]>min){
                second_minimum=arr1[m];
            }
        }

        System.out.println("Second minimum: "+second_minimum);




        //3rd approach

        int i,min1=Integer.MAX_VALUE,second_min=0;
        int[]arr2={-3,5,-6,2,8,-71,99};

        for(i=0;i<arr2.length;i++) {
            if(arr2[i] < min1) {
                second_min=min1;
                min1=arr2[i];
            }
        }
        System.out.println("Second minimum: "+second_min);

    }
}
