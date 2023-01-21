package Problems_31_to_40;

public class Problem_39 {
    public static void main(String[] args) {
        // print the smallest element in an array

        int[] arr = { 100,4,3,7,8,10,24,19,9,2,6,2,20};
        int i,min=Integer.MAX_VALUE;

        for(i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("The smallest element in the array is: "+min);
    }
}
