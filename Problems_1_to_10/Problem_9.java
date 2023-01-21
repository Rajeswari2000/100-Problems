package Problems_1_to_10;

public class Problem_9 {
    public static void main(String[] args) {

        //merging two sorted arrays

        //approach 1

        int i=0,j=0,m=0;

        int[]arr1={1,3,4,6};
        int[]arr2= {1,4,6,8,9};
        int[]arr3=new int[arr1.length + arr2.length];

        //program to merge the arrays with duplicates
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                arr3[m++]=arr2[j++];
            }
            else{
                arr3[m++]=arr1[i++];
            }
        }

        //adding remaining elements to arr3
        while(i< arr1.length){
            arr3[m++]=arr1[i++];
        }
        while(j< arr2.length){
            arr3[m++]=arr2[j++];
        }

        // program for removing duplicates
        for(i=0;i<arr3.length-1;i++){
            if(arr3[i]!=arr3[i+1]){
                System.out.print(arr3[i]+" ");
            }
        }
        System.out.print(arr3[arr3.length-1]);



        //approach 2  ---> using TreeSet


//        TreeSet<Integer> new_arr = new TreeSet<>();
//        int[] arr1 = {1, 3, 4, 6};
//        int[] arr2 = {1, 4, 6, 8, 9};
//        int i = 0, j = 0;
//        while (i < arr1.length) {
//            new_arr.add(arr1[i]);
//            i++;
//        }
//        while (j < arr2.length) {
//            new_arr.add(arr2[j]);
//            j++;
//        }
//        System.out.println(new_arr);
    }
}
