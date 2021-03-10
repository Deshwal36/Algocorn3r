import java.util.Scanner;

class Space_Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test;
        test=Integer.parseInt(sc.nextLine());
        while(test>0){
            int count=0,inversion=0;
            int n=Integer.parseInt(sc.nextLine());
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            sc.nextLine();
            if(n==1){
                System.out.println("First");
            }else{
            for(int i=1;i<n;i++){
                if(arr[i]<=arr[i-1]){
                    inversion=arr[i-1]-arr[i]+1;
                    arr[i]=arr[i]+inversion;
                    count+=inversion;
                }
                
                //System.out.println(count);

            }
            

            if(count%2==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }   
            test--;
        }
        return ;
    }
}