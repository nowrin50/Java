
//ID: 22234103237
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0;

        for (int i = 1; i <= n; i++) {
            x = x + i;
        }

        System.out.println(x);
    }
}
