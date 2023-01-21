package Problems_61_to_70;

import java.util.Arrays;

public class Problem_70 {
    public static void main(String[] args) {
      //Java Program to find the 2nd Largest Number in an Array

        //1st approach

        int k=2;
        int []array={3,2,7,8,5,3,98};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Second maximum: "+array[array.length-k]);



        //2nd approach

        int l,m,max1=Integer.MIN_VALUE,second_maximum=Integer.MIN_VALUE;
        int [] arr1={2,-41,1,37,-5,99,0,-225};

        for(l=0;l<arr1.length;l++){
            if(arr1[l]>max1){
                max1=arr1[l];
            }
        }

        for(m=0;m<arr1.length;m++){
            if(arr1[m]>second_maximum && arr1[m]<max1){
                second_maximum=arr1[m];
            }
        }

        System.out.println("Second maximum: "+second_maximum);



        //3rd approach

       int i;
       int[]arr2={4,7,9,4,3};
       int max= Integer.MIN_VALUE,second_max=0;
       for(i=0;i<arr2.length;i++){
           if(arr2[i]>max){
               second_max=max;
               max=arr2[i];
           }
       }
        System.out.println("Second maximum: "+second_max);
    }
}
