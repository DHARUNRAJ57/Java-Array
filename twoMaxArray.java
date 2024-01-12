package Array;
import java.util.*;

public class twoMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = sc.nextInt();

        }
        Arrays.sort(array);
        System.out.println("two min" + array[0] + " " + array[1]);
        System.out.println("two max" + array[array.length - 2] + " " + array[array.length - 1]);
    }
}
