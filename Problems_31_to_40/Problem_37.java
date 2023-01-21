package Problems_31_to_40;

public class Problem_37 {
    public static void main(String[] args) {
        //print the elements of an array present on odd position

        //based on zero indexing

        int[] arr = {1,4,6,3,7,8};
        int i,len=arr.length;
        for(i=1;i<len;i+=2) {
            System.out.print(arr[i]+" ");
        }

    }
}
