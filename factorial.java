// method 1
// using for loop
// public class factorial {
// public static void main(String[] args) {
// int n = 5;
// int fact = 1;
// for (int i = 1; i <= n; i++) {
// fact *= i;
// }
// System.out.println(fact);
// }

// }

// method 2
// using while loop
// public class factorial {
// public static void main(String[] args) {
// int n = 5;
// int fact = 1;
// while (n > 0) {
// fact *= n;
// n--;
// }
// System.out.println(fact);
// }
// }

// method 3
// do while
// public class factorial {
// public static void main(String[] args) {
// int n = 5;
// int fact = 1;
// int i = 1;
// do {
// fact *= i;
// i++;
// } while (i <= n);
// System.out.println(fact);
// }
// }

// method 4
// public class factorial {
// public static void main(String[] args) {
// System.out.println(facto(5));
// }

// static int facto(int n) {
// if (n == 0 || n == 1) {
// return 1;
// }
// return n * facto(n - 1);
// }
// }

// method 5
// public class factorial {
// public static void main(String[] args) {
// int n = 5;
// int fact = 1;
// for (int i = n; i >= 1; i--) {
// fact *= i;
// }
// System.out.println(fact);
// }
// }
