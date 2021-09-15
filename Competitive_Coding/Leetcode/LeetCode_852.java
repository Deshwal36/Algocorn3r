public class LeetCode_852 {

    public static void main(String[] args) {

        int[] arr={18,29,38,59,98,100,99,98,90};
        System.out.println(peakIndexInMountainArray(arr));

    }

    static int peakIndexInMountainArray(int[] arr) {


        int s=0,e=arr.length-1;
        int mid=-1;
        while(s<e){
            mid=s+(e-s)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                s=mid;
            }else{
                e=mid;
            }
        }
        return mid;

    }

}
