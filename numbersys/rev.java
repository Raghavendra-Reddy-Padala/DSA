package numbersys;

public class rev {
    public static void main(String[] args) {
        int x =-21021;
        boolean isneg=x<0;
        x=Math.abs(x);
         int res=0;
         while(x!=0){
            int last = x%10;
            res=res*10+last;
            x=x/10;
         }
         if(isneg){
            System.out.println(-res);
         }else{
            System.out.println(res);
         }
    }
}
