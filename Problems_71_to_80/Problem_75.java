package Problems_71_to_80;

public class Problem_75 {
    public static void main(String[] args) {
    //Print Odd and Even Number from an Array

        int i;
        int[]arr={2,3,1,5,8,3,4};

        System.out.println("Odd numbers in the array: ");
        for(i=0;i<arr.length;i++){
            if(arr[i]%2!=0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Even numbers in the array: ");
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
                System.out.println(arr[i]);
            }
        }
    }
}
