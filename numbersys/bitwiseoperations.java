package numbersys;

public class bitwiseoperations {

    public static void main(String[] args) {
        int a = 3;
    int b=4;
    System.out.println(a&b);
    System.out.println(a|b);

    //checkout why this is giving a negative number
    System.out.println(~a);
    
    System.out.println(a^b);

    //leftshift
    System.out.println(10<<1);
    System.out.println(10<<2);
    //rightshift
    System.out.println(10>>1);

    //code to find no of 1 bits in a binary num

    int n=7;

    int c=0;
    while(n!=0){
        int lb=n&1;
        if(lb==1){
            c++;
        }
        n=n>>1;
    }
    System.out.println(c);



    //couting total no of bits 
    //ref problem counting bits
    int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        System.out.println(ans);

    //another
    int[] arr = new int[n + 1]; 
    for (int i = 0; i <= n; i++) {
        arr[i] = countOnes(i);
    }
    System.out.println(arr);
}
private static int countOnes(int x) {
    int count = 0;
    while (x > 0) {
        count += x & 1;  
        x >>= 1;         
    }
    return count;
    }

    }


