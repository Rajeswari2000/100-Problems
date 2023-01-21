package Problems_71_to_80;

public class Problem_77 {
    public static void main(String[] args) {
       //Java Program to sort the elements of an array in ascending order


       int [] arr={2,4,8,5,1,9,-5,0};
       int i,j,temp;

       for(i=0;i< arr.length-1;i++){
           for(j=i+1;j< arr.length;j++){
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }

        for(int k:arr){
            System.out.print(k+" ");
        }

    }
}
