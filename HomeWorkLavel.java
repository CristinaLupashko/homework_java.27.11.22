import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkLavel {
    public static void main(String[] args) {


        int[] array = new int[100];
        int[] ar = new int[100];

        for (int i = 0; i < 100; i++){
            array[0] =111;
            array[i] = 111 * i + 111;

            for (int j = 10; j < 100; j++) {
                array[j] = 111 ;
                array[j] = 111 *(j - 10) + 111;


                System.out.println(Arrays.toString(array) + (ar));
            }
        }
        int [] arrays = new int [100];
        for (int i = 1; i < 99; i++) {
            arrays[i] = 10;
        }

        System.out.println(Arrays.toString(arrays));

    }

        }

