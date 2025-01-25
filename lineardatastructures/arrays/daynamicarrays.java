package lineardatastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class daynamicarrays {
    public static void main(String[] args) {
        //time to learn arraylists
        //arryas are dyanmic and have some built in functions to sort out things;
        //create a dynamic arrray
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,44,5));
        arr.add(50);
        arr.add(30);
        arr.remove(5);
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
    }
}
