import java.util.*;

public class SystemTest{
    public static void main(String[]  args){

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,0};

        System.arraycopy(a, 2, b, 1, 3);
        System.out.println("The new array b is "+Arrays.toString(b));

        System.out.println("Java Home Dir: "+System.getProperty("java.home"));

    }
}