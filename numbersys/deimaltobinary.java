package numbersys;

import java.util.Scanner;

 class Converter{
    public String  tobinary(int decimal){
        String res="";
        while(decimal>0){
            int lastbit = decimal&1;
            res=lastbit+res;
            decimal=decimal>>1;
        }
        return res;
    }
}



public class deimaltobinary {
    
    public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        System.out.println("enter your decimal number");
           int x=in.nextInt();
        //using a array 

        //    int[] arr = new int[4];

        //    int i =0;
        //    while(x>0){
        //      arr[i]=x%2;
        //      x=x/2;
        //      i++;
        //    }
        //    for (int k = i-1; k >= 0; k--) {
        //     System.out.print(arr[k]);
        // }
        // System.out.println();
        
        //using stringbuilder
        //   StringBuilder binaryString = new StringBuilder();

        //   while (x > 0) {
        //     binaryString.insert(0, x % 2); 
        //     x = x / 2; 
        // }
        // System.out.println("Binary representation: " + binaryString.toString());



        //very beter aproach using bitwise operator
        Converter c = new Converter();
        System.out.println(c.tobinary(x));
        
        in.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
