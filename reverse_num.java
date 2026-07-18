// method 1
// using modulus and division and while
// public class reverse_num {
// public static void main(String[] args) {
// int n = 652682;
// int reverse = 0;
// while (n != 0) {
// int digit = n % 10;
// reverse = reverse * 10 + digit;
// n /= 10;
// }
// System.out.println("reverse num: " + reverse);

// }

// }

// method 2
// using String conversion
// import java.util.Scanner;

// public class reverse_num {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");

// int n = sc.nextInt();
// String s = String.valueOf(n);
// String rev = "";
// for (int i = s.length() - 1; i >= 0; i--) {
// rev += s.charAt(i);
// }
// System.out.println("reversed num:" + rev);

// }
// }

// method 3
// using recursion
// public class reverse_num {
// public static void main(String[] args) {
// int n = 12345;
// reverse(n);
// System.out.println("reversed num=" + rev);
// }

// static int rev = 0;

// static void reverse(int n) {
// if (n == 0) {
// return;
// }
// rev = rev * 10 + n % 10;
// reverse(n / 10);
// }
// }

// method 4
// using character arr
public class reverse_num {
    public static void main(String[] args) {
        int n = 12345;
        char[] digits = String.valueOf(n).toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }

}