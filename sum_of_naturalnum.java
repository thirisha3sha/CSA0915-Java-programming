// method 1
// import java.util.Scanner;

// public class sum_of_naturalnum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a limit:");
// int n = sc.nextInt();
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// sum += i;
// }
// System.out.println("sum of first " + n + " natural num is:" + sum);
// sc.close();
// }

// }

// method 2

// Using for while loop
// import java.util.Scanner;

// public class sum_of_naturalnum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a limit:");
// int n = sc.nextInt();
// int sum = 0;
// int i = 1;
// while (i <= n) {
// sum += i;
// i++;
// }
// System.out.println("Sum of first " + n + " natural num is:" + sum);
// sc.close();

// }

// }

// method 3

// using do while loop
// import java.util.Scanner;

// public class sum_of_naturalnum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a limit:");
// int n = sc.nextInt();
// int sum = 0;
// int i = 1;
// do {
// sum += i;
// i++;
// } while (i <= n);
// System.out.println("sum of first " + n + " natural num is:" + sum);
// sc.close();
// }

// }

// method 4

// using formula n(n+1)/2
// import java.util.Scanner;

// public class sum_of_naturalnum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a limit:");
// int n = sc.nextInt();
// int sum = n * (n + 1) / 2;
// System.out.println("sum of first " + n + " natural num is:" + sum);
// sc.close();
// }

// }

// method 5

// using recursion
// import java.util.Scanner;

// public class sum_of_naturalnum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a limit:");
// int n = sc.nextInt();
// System.out.println("sum= " + calculate_sum(n));
// sc.close();
// }

// static int calculate_sum(int n) {
// if (n == 1)
// return 1;
// else
// return n + calculate_sum(n - 1);
// }

// }

// method 6

// using a method
// import java.util.Scanner;

// public class sum_of_naturalnum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a limit:");
// int n = sc.nextInt();
// System.out.println("sum= " + findsum(n));
// sc.close();
// }

// static int findsum(int n) {
// int sum = 0;
// for (int i = 1; i <= n; i++) {
// sum += i;
// }
// return sum;
// }

// }

// method 7

// using ternary & recursion
// import java.util.Scanner;

// public class sum_of_naturalnum {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a limit:");
// int n = sc.nextInt();
// System.out.println("sum= " + calculate_sum(n));
// sc.close();
// }

// static int calculate_sum(int n) {
// return (n == 1) ? 1 : n + calculate_sum(n - 1);
// }

// }
