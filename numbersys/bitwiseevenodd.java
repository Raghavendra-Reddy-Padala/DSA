package numbersys;

public class bitwiseevenodd {
    public static void main(String[] args) {
        //by converting a value into birnay num bit coplex
        int x = 100;
        String y=Integer.toBinaryString(x);
       String z = ((y.charAt(y.length()-1)=='0')?"even":"odd");
       System.out.println(z);
        //god level
       String res= ((x & 1)==0)?("even"):("odd");
       System.out.println(res);
    }
    
}
