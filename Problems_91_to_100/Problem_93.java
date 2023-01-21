package Problems_91_to_100;

public class Problem_93 {
    static void sortAsc(char[] arr,int i){

        //Java Program to sort the characters in a word in descending using recursion

        if(i== arr.length)
            return;
        int j=i+1;
        while (j < arr.length){
            if(arr[i]>arr[j]){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        sortAsc(arr, i+1);
    }

    public static void main(String[] args) {
        String string1 = "hello";
        char[]arr=string1.toCharArray();
        sortAsc(arr,0);
        String result="";
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        System.out.println(result);
    }
}
