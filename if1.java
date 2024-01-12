import java.util.*;

public class if1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age <= 18) {
            System.out.println("Your not eglible for voting");
        } else if (age >= 60) {
            if (age <= 100) {
                System.out.println("your age was reached above 60");
            } else {
                System.out.println("your age was reached above 100");
            }
        } else {
            System.out.println("Your eglible for voting");
        }
    }
}
