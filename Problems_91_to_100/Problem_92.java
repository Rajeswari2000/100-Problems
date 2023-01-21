package Problems_91_to_100;

import java.util.Arrays;

public class Problem_92 {
        static void sortAsc(String[] arr,int i){

            //Java Program to sort the words in ascending using recursion

            if(i== arr.length)
                return;
            int j=i+1;
            while (j < arr.length){
                if(arr[i].charAt(0)>arr[j].charAt(0)){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                //if the words starts with same alphabets checking next letters
                else if (arr[i].charAt(0)==arr[j].charAt(0)) {
                    for (int k = 1; k<(Math.min(arr[i].length(), arr[j].length())); k++){
                        if(arr[i].charAt(k)>arr[j].charAt(k)){
                            String temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }
                j++;
            }
            sortAsc(arr, i+1);
        }

        public static void main(String[] args) {
            String[ ] arr = {"hello","everyone","how","are","you","good","to","see","you","all","."};
            sortAsc(arr,0);
            System.out.println(Arrays.toString(arr));
        }
}
