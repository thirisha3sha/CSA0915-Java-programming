
// divisible by 3,2 in a range .print sum and count
import java.util.Scanner;

public class ipa_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0, count = 0;
        for (int i = a; i < b; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("sum:" + sum);
        System.out.println("count:" + count);

    }

}
