package Array;
import java.util.Scanner;

public class arrayavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        double total = 0;

        for (int j = 0; j < array.length; j++) {
            total += array[j];
        }
        double tot = total / array.length;
        System.out.println(tot);
    }
}
