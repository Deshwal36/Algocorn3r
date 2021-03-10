import java.util.Scanner;


class Interesting_XOR_{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,value;
        int testCases=Integer.parseInt(sc.nextLine());


        while(testCases>0){
            value=Integer.parseInt(sc.nextLine());
            int d=(int)Math.ceil(Math.log(value)/Math.log(2));
            a=0;
            b=0;
            System.out.println("d:"+d);

            /*

            3: 11
            10:2
            01:1
            13: 1 1 0 1
            d->4 | i->3--0
            i=2

            a:101
            b:011
            */
            int bit=0;
            for(int i=d-1;i>=0;i--){//d=2 | i : 1,0

                bit=value & (1<<i);
                 if(i==d-1 && bit>0){
                     a=1;
                     System.out.println("1stt");
                 }else{
                   System.out.println("2ndd");
                 if(bit>0){
                     a=a<<1;
                     b=b<<1;
                     b|=1;
                 }else{
                    a=a<<1;
                    a=a|1;
                    b=b<<1;
                    b=b|1;
                 }
                }
               System.out.println("i :"+i+"a: "+a+"b : "+b);
                
            }
            
            System.out.println(a*b);
                
            testCases--;
        }
        sc.close();
        return;
    }
}