import java.util.Scanner;
import java.util.Stack;

class Chef_and_Groups{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testCases,group;
        testCases=Integer.parseInt(sc.nextLine());
        
        while(testCases>0){
            group=0;
            String s=sc.nextLine();
            Stack<Character> st=new Stack<>();
            for(int i=0;i<s.length();i++){
                
                if(st.isEmpty() && s.charAt(i)=='1'){
                    st.push(s.charAt(i));
                    group++;
                    
                }else if(st.isEmpty() && s.charAt(i)=='0'){
                    st.push(s.charAt(i));
                }else{
                if(st.peek()=='0'&& s.charAt(i)=='1'){
                    group++;
                    st.push(s.charAt(i));
                    continue;
                }
                if(st.peek()=='0'&& s.charAt(i)=='0'){
                    continue;
                }
                if(st.peek()=='1'&& s.charAt(i)=='0'){
                    st.push(s.charAt(i));
                    continue;
                }
                if(st.peek()=='1' && s.charAt(i)=='1'){
                    continue;
                }
            }
            }
            System.out.println(group);

            testCases--;
        }
        sc.close();
        return;

    }
}