// method 1
// public class num_of_digits_in_num {
// public static void main(String[] args) {
// int n = 93849970;
// int count = 0;
// while (n != 0) {
// n /= 10;
// count++;
// }
// System.out.println(count);
// }

// }

// method 2 using recursion
// public class num_of_digits_in_num {
// public static void main(String[] args) {
// int n = 90877;
// System.out.println(digits(n));
// }

// static int digits(int n) {
// if (n == 0) {
// return 0;
// }
// return 1 + digits(n / 10);
// }
// }

// method 3
// public class num_of_digits_in_num {
// public static void main(String[] rgas) {
// int n = 908664;
// String res = Integer.toString(n);
// System.out.println(res.length());
// }
// }

// methdo 4
public class num_of_digits_in_num {

    public static void main(String[] args) {
        System.out.println(Integer.toString(Math.abs(12345)).length());
    }
}