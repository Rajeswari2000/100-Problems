package Problems_61_to_70;

public class Problem_62 {
    public static void main(String[] args) {
       //Java Program to print the elements of an array present on even position and odd positions

        int i;
        int[]arr = {1,2,3,4,5};
        System.out.println("Elements at even position: ");
        for(i=1;i<arr.length;i+=2){
            System.out.println(arr[i]);
        }

        System.out.println("Elements at odd position: ");
        for(i=0;i<arr.length;i+=2){
            System.out.println(arr[i]);
        }
    }
}
