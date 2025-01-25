package tcscodevita;

import java.util.*;

public class x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine(); 
        String[] substrings = input.nextLine().split(" ");
        String main= input.nextLine();

        int result = removestr(main, substrings);
        System.out.println(result);
        input.close();
    }
    public static int removestr(String main , String[] substrings){
        int c=1;
        for(String i : substrings){
            if(main.contains(i)){
                main=main.replace(i,"");
                c++;
            }
        }
        return c;
    }
}
