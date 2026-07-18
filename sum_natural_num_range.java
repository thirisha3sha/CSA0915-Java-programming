// method 1

// using for loop
// import java.util.Scanner;

// public class sum_natural_num_range {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a start:");
// int a = sc.nextInt();
// System.out.println("enter a end:");
// int b = sc.nextInt();
// int sum = 0;
// for (int i = a; i <= b; i++) {
// sum += i;
// }
// System.out.println("sum=" + sum);
// sc.close();
// }

// }

// method 2

// using while loop
// import java.util.Scanner;

// public class sum_natural_num_range {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a start:");
// int a = sc.nextInt();
// System.out.println("enter a end:");
// int b = sc.nextInt();
// int sum = 0;
// while (a <= b) {
// sum += a;
// a++;
// }
// System.out.println("sum=" + sum);
// sc.close();
// }

// }

// method 3

// using formula sum(1 to end) - sum(1 to start-1)
/*
 * Sum(1 to 10) = 55 // a=5 b=10
 * Sum(1 to 4) = 10
 * 
 * 55 - 10 = 45
 */ // most efficient (O(1) time complexity
// import java.util.Scanner;

// public class sum_natural_num_range{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a start:");
// int a = sc.nextInt();
// System.out.println("enter a end:");
// int b = sc.nextInt();
// int sum = (b * (b + 1) / 2) - ((a - 1) * a / 2);
// System.out.println("sum=" + sum);
// sc.close();
// }
// }

// method 4

// using a method
// import java.util.Scanner;

// public class sum_natural_num_range {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a start:");
// int a = sc.nextInt();
// System.out.println("enter a end:");
// int b = sc.nextInt();
// int sum = rangeSum(a, b);
// System.out.println("sum=" + sum);
// sc.close();
// }

// static int rangeSum(int a, int b) {
// return (b * (b + 1) / 2) - ((a - 1) * a / 2);
// }

// }

// Method 5
