import java.util.Scanner;

class Turn_It{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){

        int u=sc.nextInt();
        int v=sc.nextInt();
        int a=sc.nextInt();
        int s=sc.nextInt();

            Double V=Math.pow(u, 2)-(2*a*s);
            if(V>v){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
            t--;
        }

        sc.close();
        


    }
}