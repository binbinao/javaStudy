import java.util.Scanner;
import java.util.Random;

public class RandomTest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Random random = new Random();

        System.out.println(random.nextInt(n-m+1)+m);
    }
}