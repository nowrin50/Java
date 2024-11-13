import java.util.Scanner;

public class Arithmetic_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int c=sc.nextInt();
        try {
            int a = b / c;
            System.out.println(a);
        }
        catch(ArithmeticException arexp){
            System.out.println("Divided by 0");

        }
    }
}
