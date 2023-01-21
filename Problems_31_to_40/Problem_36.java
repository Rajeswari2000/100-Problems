package Problems_31_to_40;

public class Problem_36 {
    public static void main(String[] args) {
        //print the elements of an array present on even position

        //based on zero indexing

        int[] arr = {1,4,6,3,7,8};
        int i,len=arr.length;
        for(i=0;i<len;i+=2) {
            System.out.print(arr[i]+" ");
        }

    }
}
