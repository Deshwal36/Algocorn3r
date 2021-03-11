import java.util.Arrays;
import java.util.Scanner;

class Space_Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test;
        test=sc.nextInt();
        while(test>0){
            int flag=0,inversion=0;
            int n=sc.nextInt();
            int[] arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);
            
            for(int i=0;i<n;i++){
                if((i+1-arr[i]) <0){
                    flag=1;
                    break;
                }
                inversion+=(i+1-arr[i]);
           }
    
            if(flag==1){
                System.out.println("Second");
            }
            else{
                if(inversion%2==1){

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