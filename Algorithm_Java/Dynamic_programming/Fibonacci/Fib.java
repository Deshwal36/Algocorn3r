package Fibonacci;

import java.util.Map;

public class Fib {

    int fibRecursion(int n){
        if(n==0||n==1)
        return 1;
        else
        return fibRecursion(n-1)+fibRecursion(n-2);

    }
    //top-down 
    int fibMemoization(int n,Map<Integer,Integer> table){
      
        if(!table.containsKey(n))
            table.put(n, fibMemoization(n-1, table)+fibMemoization(n-2, table));
        return table.get(n);
    }

    int fibTabulation(int n,Map<Integer,Integer> table){
        
        for(int i=2;i<=n;i++){
            table.put(i, table.get(i-1)+table.get(i-2));
        }
        return table.get(n);
    }
    
}
