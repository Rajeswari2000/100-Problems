package Problems_61_to_70;

public class Problem_63 {
    public static void main(String[] args) {
       //Java Program to print the largest element and smallest element in an array

        int[] arr = {1,4,3,7,8,10,24,19,9,3,6,20};
        int i,max=Integer.MIN_VALUE;

        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: "+max);

        int[] arr1 = { 100,4,3,7,8,10,24,19,9,2,6,2,20};
        int l,min=Integer.MAX_VALUE;

        for(l=0;l<arr1.length;l++){
            if(arr1[l]<min){
                min = arr1[l];
            }
        }

        System.out.println("The smallest element in the array is: "+min);
    }
}
