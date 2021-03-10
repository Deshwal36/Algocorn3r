import java.util.Scanner;

class Space_Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test;
        test=Integer.parseInt(sc.nextLine());
        while(test>0){
            int count=0,inversion=0;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            for(int i=1;i<n;i++){
                if(arr[i]<=arr[i-1]){
                    inversion=arr[i-1]-arr[i]+1;
                    arr[i]=arr[i]+inversion;
                    count+=inversion;
                }
                
           }
            

            if(count%2==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
      
            test--;
        }
        sc.close();
        return ;
    }
}