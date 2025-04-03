import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] rnos = new int[5];
        rnos[0]  = 123;
        rnos[1]  = 13;
        rnos[2]  = 3;
        rnos[3]  = 2;
        rnos[4]  = 23;
//        System.out.println(rnos[1]);



        for (int i = 0; i < rnos.length; i++) {
            rnos[i] = in.nextInt();

        }


        System.out.println(Arrays.toString(rnos));


    }
}