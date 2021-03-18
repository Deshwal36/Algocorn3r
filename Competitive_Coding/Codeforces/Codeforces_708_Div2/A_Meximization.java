import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class A_Meximization{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,t;
        t=sc.nextInt();
        
        while(t>0){
            n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            Arrays.sort(arr);

            ArrayList<Integer> b=new ArrayList<>();
            Map<Integer,Integer> hm=new HashMap<>();
            int count=0;
            for(int i=0;i<n-1;i++){
                
                if(arr[i]!=arr[i+1]){
                    b.add(arr[i]);
                }else{
                    b.add(arr[i]);
                    while(arr[i]==arr[i+1]){
                    count++;
                    i++;
                    }
                    hm.put(arr[i], count);
                    
                }
                if(i==n-2)
                b.add(arr[n-1]);

            }

        Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator(); 
          
        while(itr.hasNext()) 
        { 
             Map.Entry<Integer, Integer> entry = itr.next(); 
             for(int i=0;i<entry.getValue();i++){
                 b.add(entry.getKey());
             }
             itr.remove();
        } 
        
        for (Integer integer : b) {
            System.out.print(integer+" ");
            
        }
        System.out.println();

            t--;
        }
        sc.close();
    }
}