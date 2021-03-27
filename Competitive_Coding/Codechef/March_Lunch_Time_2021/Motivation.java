import java.util.Scanner;
import java.util.TreeMap;


class Motivation{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){

            int n=sc.nextInt();
            int x=sc.nextInt();

            TreeMap<Integer,Integer> tm=new TreeMap<>();
            for(int i=0;i<n;i++){
                tm.put(sc.nextInt(), sc.nextInt());
            }
            int max=0;
            for (Integer key : tm.descendingKeySet()) {
                if(key>x){
                continue;
                }
                else{
                    if(tm.get(key)>max)
                    max=tm.get(key);
                }
            }
            System.out.println(max);
            t--;    
        }
        sc.close();
        
    }
}