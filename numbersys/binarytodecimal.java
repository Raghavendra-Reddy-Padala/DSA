package numbersys;


 class converter{
    public   int  tobinary(int bin){
        int res=0;
        int index =0;
        while(bin!=0)
{
    int lastbit=bin%10;
    if(lastbit==1){
        res=res+(int)Math.pow(2, index);
    }
    index=index+1;
    bin=bin/10;
}
        return res;
    }
}
public class binarytodecimal {
    public static void main(String[] args) {
        int x=1000001;
        converter z = new converter();
       System.out.println( z.tobinary(x));


       //doing same opertion but by using a string

       String binary="1000001";
       int decimal=0;
       int index=0;
       for (int i = (binary.length() - 1); i >= 0; i--, index++) {

        if (Integer.valueOf(binary.charAt(i)) == '1') {
        decimal = decimal + (int)Math.pow(2, index);
        }
    
        }
    
        System.out.println(decimal);
        System.out.println(Integer.reverse(1021));

    }
}
