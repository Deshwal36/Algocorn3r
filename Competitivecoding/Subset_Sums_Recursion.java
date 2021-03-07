import java.util.ArrayList;
import java.util.Collections;

public class Subset_Sums_Recursion {

    public static void main(String[] args) {
        int[] arr=new int[]{2,1,5};
        int n=arr.length;
        ArrayList<Integer> ans= subsetSums(arr,n);

        for (Integer integer : ans) {
            System.out.print(integer+":");
        }

    }

    static ArrayList<Integer> subsetSums(int[] arr,int n){
        ArrayList<Integer> sumSubset=new ArrayList<>();
        int index=0;
        int sum=0;
        func(sumSubset,arr,n,index,sum);
        Collections.sort(sumSubset);
        return sumSubset;

        
    }
    /*
    func : return all subset sums
    */
    static void func(ArrayList<Integer> sumSubset,int[] arr,int n,int index,int sum){

        if(index==n){
            sumSubset.add(sum);
            return;
        }
        //pick
        func(sumSubset, arr, n, index+1, sum + arr[index]);
        //Do-not pick
        func(sumSubset, arr, n, index+1, sum);

    }
}
