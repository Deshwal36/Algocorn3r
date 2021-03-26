import java.util.Scanner;
import java.util.Stack;

class Moons_and_Umbrellas{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        int c=1;
        while(t>0){

            int x=Integer.parseInt(sc.next());
            int y=Integer.parseInt(sc.next());
            String str=sc.nextLine();

            Stack<Character> s=new Stack<>();

            int cost=0;

            for(int i=0;i<str.length();i++){

                if(str.charAt(i)=='?'){
                    continue;
                }else{
                    if((str.charAt(i)=='C' || str.charAt(i)=='J') && s.isEmpty()){
                        s.push(str.charAt(i));
                    }else{
                        if(str.charAt(i)=='C' && s.peek()=='C'){
                            continue;
                        }else if(str.charAt(i)=='C' && s.peek()=='J'){
                            cost+=y;
                            s.pop();
                            s.push(str.charAt(i));
                        }else if(str.charAt(i)=='J' && s.peek()=='C'){
                            cost+=x;
                            s.pop();
                            s.push(str.charAt(i));
                        }else if(str.charAt(i)=='J' && s.peek()=='J'){
                            continue;
                        }
                    }
                }

            }
            System.out.println("Case #"+c+": "+cost);
            c++;

            t--;
        }
        
    }
}