package Problems_91_to_100;

public class Problem_97 {
    public static void main(String[] args) {
      //Java program to find a character in a given string using binary search
        String str = "abcde";
        char charToBeSearched='e';
        int index = characterBinarySearch(str,charToBeSearched);
        if(index==-1){
            System.out.println("The given character is not found");
        }
        else{
            System.out.println("The given character is present at the index: "+ index);
        }
    }

    public static int characterBinarySearch(String str,char charToBeSearched){

        int low=0, high=str.length()-1;
        int mid = (low+high)/2;

         while(low<=high){
             if(str.charAt(mid)==charToBeSearched){
                 return mid;
             }
             else if(str.charAt(mid)<charToBeSearched){
                 low=mid+1;
             }
             else if(str.charAt(mid)>charToBeSearched){
                 high=mid-1;
             }
             mid = (low+high)/2;
         }
         return -1;
    }
}
