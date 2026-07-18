// An Armstrong Number is a number that is equal to the sum of its digits raised
// to the power of the number of digits.
// Examples:

// 153 = 1^3 + 5^3 + 3^3 = 153
// 370 = 3^3 + 7^3 + 0^3 = 370
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634

// public class armstrong {
// public static void main(String[] args) {
// int n = 153;
// int temp = n;
// int sum = 0;
// int count = 0;
// while (temp > 0) {
// count++;
// temp /= 10;

// }
// temp = n;
// while (n > 0) {
// int digit = n % 10;
// sum += (int) Math.pow(digit, count);
// n /= 10;
// }
// System.out.println((sum == temp) ? "armstrong" : "not armstrong");
// }

// }

//  method 2

public class armstrong {
    public static void main(String[] args) {
        int n = 1533;
        int temp = n;
        int sum = 0;
        int count = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }
            sum += power;
            n /= 10;
        }
        System.out.println((sum == temp) ? "armstrong" : "not armstrong");

    }
}
