import java.util.Scanner;


class Interesting_XOR_{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a,b,bits,counter;
        int testCases=Integer.parseInt(sc.nextLine());


        while(testCases>0){
            bits=sc.nextLong();
            int d=(int)Math.ceil(Math.log(bits)/Math.log(2));
            a=0;
            b=0;
            counter=0;
           
            while(bits>0){
                if((bits & 1)>0){
                    //set
    
                    if(d==counter+1){
                        a|=(1<<counter);
                    }else{
                        b|=(1<<counter);
                    }
                }else{
                    //notset
                    a|=(1<<counter);
                    b|=(1<<counter);
    
                }
                counter++;
                bits>>=1;
    
            }
            System.out.println(a*b);
                
            testCases--;
        }
        sc.close();
        return;
    }
}