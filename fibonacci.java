// method 1
// usisng for loop
// public class fibonacci {
// public static void main(String[] args) {
// int n = 10;
// int a = 0, b = 1;
// for (int i = 1; i <= n; i++) {
// System.out.print(a + " ");
// int c = a + b;
// a = b;
// b = c;
// }
// }

// }

// method 2
// using while loop
// public class fibonacci {
// public static void main(String[] args) {
// int n = 10;
// int a = 0, b = 1;
// int count = 0;
// while (count < n) {
// System.out.print(a + " ");
// int c = a + b;
// a = b;
// b = c;
// count++;
// }
// }
// }

// method 3
// suing recursion
// public class fibonacci {
// public static void main(String[] args) {
// int n = 10;
// for (int i = 0; i < n; i++) {
// System.out.print(fibo(i) + " ");
// }
// }

// static int fibo(int n) {
// if (n <= 1) {
// return n;
// }
// return fibo(n - 1) + fibo(n - 2);
// }
// }

// method 4
// nth fiboannci num
// public class fibonacci {
// public static void main(String[] args) {
// int n = 10;
// int a = 0, b = 1;
// for (int i = 1; i < n; i++) {
// int c = a + b;
// a = b;
// b = c;
// }
// System.out.println(b);
// }
// }

// method 5
// using array
public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        for (int i : fibo) {
            System.out.print(i + " ");
        }

    }
}