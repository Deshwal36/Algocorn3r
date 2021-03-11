import java.util.Arrays;
import java.util.Scanner;

class Space_Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long test;
        test=sc.nextLong();
        while(test>0){
            long flag=0,ans=0;
            long n=sc.nextLong();
            long[] arr=new long[(int) n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

            Arrays.sort(arr);
            
            for(int i=0;i<n;i++){
                if(i+1<arr[i]){
                    flag=1;
                    break;
                } 
                ans+=(i+1-arr[i]);
           }
    
            if(flag==1){
                System.out.println("Second");
            }
            else{
                if(ans % 2==1){

                    System.out.println("First");
                }
                else{

                    System.out.println("Second");
                }
            }
      
            test--;
        }
        sc.close();
        return ;
    }
}