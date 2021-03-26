import java.util.Scanner;

class Reversort{


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=1;
         while(t>0){

            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int min,index,cost=0;
            // 7 6 5 4 3 2 1
            for(int i=0;i<n-1;i++){
                min=arr[i];
                index=i;
                
                for(int j=i;j<n;j++){
                    if(arr[j]<min){
                        min=arr[j];
                        index=j;
                    }   
                }
                //System.out.println(" i: "+i+" j: "+index);

                cost+=index-i+1;
                
                reverse(arr,i,index);
                


                
            }
            // for(int k=0;k<n;k++)
            // System.out.print(arr[k]+" ");
            System.out.println("Case #"+c+": "+cost);
            c++;
             t--;
         }
    }

    private static void reverse(int[] arr, int i, int index) {

        //0-6 | 1-5 | 2-4 | 3-3-----i=0 index=6
        for (int j= i ,k=index; j <= k ; j++,k--)
        {
            int tempswap = arr[j]; 
                arr[j] = arr[k]; 
                arr[k] = tempswap;             
        } 
        // for(int k=0;k<arr.length;k++)
        //     System.out.print(arr[k]+" ");
        // System.out.println();
    }

    
}