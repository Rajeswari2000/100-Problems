package Problems_61_to_70;

public class Problem_68 {
    public static void main(String[] args) {
      //Java Program to print the sum of all the items of the array

        int i,sum=0;
        int []arr={3,6,9,4,3,2};
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
