package Array;
import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];
        for (int j = 0; j < size; j++) {
            array[j] = sc.nextInt();
        }
        Arrays.sort(array);
        List<Integer> val = new ArrayList<>();
        for (int item : array) {
            if (!val.contains(item)) {
                val.add(item);
            }
        }
        System.out.println(Arrays.toString(val.toArray()));

    }
}