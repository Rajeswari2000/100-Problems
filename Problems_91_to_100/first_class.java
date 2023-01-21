package Problems_91_to_100;

public class first_class {
    public static  void main(String[] args) {
        int [] nums = {0,0,1,1,1,1,2,3,3};

        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int i,count=1,j,curr_index=0;

        for(i=0;i<nums.length-1;i++){

            if(nums[i]==nums[i+1]){
                count++;
            }

            if(nums[i]!=nums[i+1]){
                if(count<3){
                    for(j=1;j<=count;j++){
                        nums[curr_index++]=nums[i];
                    }
                }
                else{
                    for(j=1;j<=2;j++){
                        nums[curr_index++]=nums[i];
                    }
                }
                count=1;
            }

        }
        if(nums[i-1]==nums[i]){
            count++;
            if(count<3){
                for(j=1;j<=count;j++){
                    nums[curr_index++]=nums[i];
                }
            }
            else{
                for(j=1;j<=2;j++){
                    nums[curr_index++]=nums[i];
                }
            }
        }
        else{
            nums[curr_index]=nums[i];
        }
        return curr_index+1;

//        int i = 0;
//        for (int n : nums)
//            if (i < 2 || n > nums[i-2])
//                nums[i++] = n;
//        return i;
    }
//approach 1
//    public int removeDuplicates(int[] nums) {
//        int i,count=1,j;
//        int [] freq = new int [100];
//        int[] expectedNums = new int[nums.length];
//
//        for(i=0;i<nums.length;i++){
//            freq[nums[i]]++;
//        }
//
//        for(j=0;j<freq.length;j++){
//            if(freq[j]<=2){
//                for(i=0;i<freq[j];i++){
//                    expectedNums[i]=j;
//                }
//            }
//        }
//    }
}
