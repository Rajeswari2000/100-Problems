package Problems_61_to_70;

public class Problem_65 {
    public static void main(String[] args) {
      int i;
      int[]arr={1,3,4,6};
      int[]freq = new int[101];
      for(i=0;i < arr.length;i++){
          freq[arr[i]]++;
      }

      int l=0;
      for(int k: freq){
          if (k != 0){
              System.out.print(arr[l++]+" occurs "+k+" times\n");
          }
      }
    }
}
