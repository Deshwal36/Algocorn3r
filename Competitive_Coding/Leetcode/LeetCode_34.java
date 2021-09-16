import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode_34 {

    public static void main(String[] args) {
            int[] nums={2,2,2,2,2};
            int target=3;

            System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    //first value >=target
    public static int firstpos(int[] nums, int target) {

        int n=nums.length;
        int low=0, high=n-1;
        int first_pos=n;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]>=target){
                first_pos=mid;
                high=mid-1;
            }else{//nums[mid]<target
                low=mid+1;
            }
        }
        return first_pos;
    }

    public static int[] searchRange(int[] nums, int target){
        int first=firstpos(nums,target);
        int last=firstpos(nums,target+1)-1;
        if(first<=last){
            return new int[]{first,last};
        }
        return new int[]{-1,-1};

    }
}
