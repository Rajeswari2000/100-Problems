package Problems_51_to_60;

public class Problem_54 {
    public static void main(String[] args) {
        //Write a program to sort the elements in odd positions in descending order and
        // elements in even positions in ascending order

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9};
        int i, j, n, temp;
        n = arr.length;
        for(i=0;i<n;i+=2){
            for(j=i+2;j<n;j+=2){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=1;i<n;i+=2){
            for(j=i+2;j<n;j+=2) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int o:arr){
            System.out.print(o+" ");
        }

    }
}
