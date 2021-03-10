public class test {
    public static void main(String[] args) {
        int v=13,a=0;
        if((v & (1<<3))!=0){
            a|=1<<3;
            a|=1<<2;

        }
        System.out.println(13&(1<<0));
    }
}
