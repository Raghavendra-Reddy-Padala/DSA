package numbersys;

public class practice {
    public static void main(String[] args) {
        // int h=1;
        // System.out.println(~h);
        // rec(5);
        System.out.println(iterpow(3, 2));
        System.out.println(recpow(3, 2));

    }
    public static int iterpow(int x,int n){
        int pow=1;
        for(int i=1;i<=n;i++){
            pow=pow*x;
        }
        return pow;
    }
    public static int recpow(int x,int n){
        if(n==0)return 1;
        if(n==1)return x;
        return x*recpow(x, n-1);
    }
    public static int  rec(int x){
        System.out.println(x);
        if(x==1){
        return x;
        }
        return rec(x-1) ;
    }
}
