package Problems_41_to_50;

public class Problem_45 {
    public static void main(String[] args) {
        //print the sum of all the items of the array

        int i,sum=0;
        int[] arr = {3,6,4,7,8,9,3,6};

        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
