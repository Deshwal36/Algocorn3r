package Fibonacci;

import java.util.HashMap;

class Main{
    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println(fib.fibRecursion(5));


        HashMap<Integer,Integer> table=new HashMap<>();
        table.put(0, 1);
        table.put(1, 1);

        System.out.println(fib.fibMemoization(5, table));
        System.out.println(fib.fibTabulation(5, table));



    }

    // static int fibRecursion(int n){
    //     if(n==0||n==1)
    //     return 1;
    //     else
    //     return fibRecursion(n-1)+fibRecursion(n-2);

    // }
    
}