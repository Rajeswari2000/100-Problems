package Problems_31_to_40;

public class Problem_38 {
    public static void main(String[] args) {
        //print the largest element in an array

        int[] arr = {1,4,3,7,8,10,24,19,9,3,6,20};
        int i,max=Integer.MIN_VALUE;

        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: "+max);
    }
}
