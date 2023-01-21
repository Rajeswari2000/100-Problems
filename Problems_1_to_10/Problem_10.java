package Problems_1_to_10;

import java.util.Arrays;

public class Problem_10 {
    public static void main(String[] args) {
        //Alternate sorting: Given an array of integers, rearrange the array in such a way that
        //the first element is first maximum and second element is first minimum

        //approach 1

        int[]arr = {1,2,3,4,5,6,7};
        Arrays.sort(arr);    //for an unsorted array
        int[] temp=arr.clone();
        int i = 0,n= arr.length, j = n-1,k=0;

        while (i < j) {
            arr[k++]=temp[j--];
            arr[k++]=temp[i++];
        }

        //for an array of odd length include the middle element
        if(arr.length%2!=0){
            arr[k]=temp[i];
        }

        System.out.println(Arrays.toString(arr));



        //approach 2

        // using arrayList

//        ArrayList<Integer> AL = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
//        Collections.sort(AL);  // for an unsorted arraylist
//        ArrayList<Integer> store = new ArrayList<>();
//        while(AL.size()>0){
//            store.add(Collections.max(AL));
//            AL.remove(Collections.max(AL));
//
//            if(AL.size()>0){
//                store.add(Collections.min(AL));
//                AL.remove(Collections.min(AL));
//            }
//        }
//        System.out.println(store);
    }
}
