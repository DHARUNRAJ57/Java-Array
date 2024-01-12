package Array;
import java.util.Scanner;

public class maxminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int k = 0; k < size; k++) {
            array[k] = sc.nextInt();

        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }

        }

        System.out.println(max);

        System.out.println(min);

    }
}
