import java.util.Arrays;

public class LeetCode_34 {

    public static void main(String[] args) {
            int[] nums={1};
            int target=1;
            System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int s=0;
        int e=nums.length-1;
        int[] ans={-1,-1};
        while(s<=e){

            int mid=s+(e-s)/2;

            if(nums[mid]==target && (mid-1<0 || nums[mid-1]<target)){
                ans[0]=mid;

                while(mid<nums.length && nums[mid]==target){
                    mid++;
                }
                ans[1]=mid-1;
                break;
            }else {
                if(nums[mid]>=target){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }

        }
        return ans;
    }
}
