
/*  find the num of even digits un a num.if it is greater thn 2 thn print true lese fasle
i/p   14236 o/p- true
      1459    o/p -false */
import java.util.Scanner;

public class find_num_of_even_digits_in_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                count++;
            }
            n /= 10;
        }
        System.out.println((count > 2) ? "True" : "False");
    }
}
