
//compare signs of two numbers
/* Integer.signum() is a built-in method that tells you the sign of an integer. */
import java.util.Scanner;

public class compare_signs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num:");
        int a = sc.nextInt();
        System.out.println("enter second num:");
        int b = sc.nextInt();
        if (Integer.signum(a) == Integer.signum(b)) {
            System.out.println("same sign");
        } else {
            System.out.println("different signs");
        }
        sc.close();
    }

}
