import java.util.Scanner;

/**
 * Problem : No_Time_to_Wait 
 */
public class No_Time_to_Wait {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,h,x,t;
        n=sc.nextInt();
        h=sc.nextInt();
        x=sc.nextInt();

        //System.out.println("values"+ n +":"+ h +":"+ x);

       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }


       for (int i = 0; i < arr.length; i++) {
            t=x+arr[i];
           if(t>=h){
               System.out.println("YES");
               return;
           }
       }
       System.out.println("NO");
       return;


    }
}
