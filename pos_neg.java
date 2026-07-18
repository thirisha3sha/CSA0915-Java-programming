// method 1
// using if else statement
// import java.util.Scanner;

// public class pos_neg{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// if (n > 0) {
// System.out.println("positive num");
// } else if (n < 0) {
// System.out.println("negative num");
// } else {
// System.out.println("num is zero");
// }
// sc.close();
// }

// }

// method 2

// using ternary operator
// import java.util.Scanner;

// public class pos_neg{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// String res = (n > 0) ? "Positive num" : "Negative num";
// System.out.println(res);
// String res1 = (n > 0) ? "Positive num" : (n < 0) ? "Negative num" : "Zero";
// System.out.println(res1);
// sc.close();
// }

// }

// method 3

// using switch case using switch expression/enhanced switch (->)
/*
 * Integer.signum() is simply a built-in shortcut that returns the sign of an
 * integer:
 * 
 * 1 → positive
 * -1 → negative
 * 0 → zero
 */
// import java.util.Scanner;

// public class pos_neg {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// switch (Integer.signum(n)) {
// case 1 -> System.out.println("Positive num");
// case -1 -> System.out.println("Negative num");
// case 0 -> System.out.println("Zero");
// }
// sc.close();
// }

// }

// method 4

// using switch expression
// integer.comapare() method is used to compare two integers. It returns a
// negative integer, zero, or a positive integer as the first argument is less
// than, equal to, or greater than the second.
/*
 * Condition Return Value
 * a > b Positive value (1)
 * a < b Negative value (-1)
 * a == b 0
 */
// import java.util.Scanner;

// public class pos_neg {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// switch (Integer.compare(n, 0)) {
// case 1 -> System.out.println("Positive num");
// case -1 -> System.out.println("Negative num");
// case 0 -> System.out.println("Zero");
// }
// sc.close();
// }

// }

// method 5
// import java.util.Scanner;

// public class pos_neg{
// public pos_neg5() {
// }

// public static void main(String[] var0) {
// Scanner var1 = new Scanner(System.in);
// System.out.println("enter a num:");
// int var2 = var1.nextInt();
// System.out.println(checkSign(var2));
// var1.close();
// }

// static String checkSign(int var0) {
// if (var0 > 0) {
// return "positive num";
// } else {
// return var0 < 0 ? "negative num" : "num is zero";
// }
// }
// }

// method 6

// Using Boolean Methods
// import java.util.Scanner;

// public class pos_neg{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// if (isPositive(n)) {
// System.out.println("positive num");
// } else if (isNegative(n)) {
// System.out.println("negative num");
// } else {
// System.out.println("num is zero");
// }
// sc.close();
// }

// static boolean isPositive(int n) {
// return n > 0;
// }

// static boolean isNegative(int n) {
// return n < 0;
// }
// }

// method 7

// Using boolean methods
// import java.util.Scanner;

// public class pos_neg {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// if (ispos(n)) {
// System.out.println("positive num");
// } else if (isneg(n)) {
// System.out.println("negative num");
// } else {
// System.out.println("num is zero");
// }
// }

// static boolean ispos(int n) {
// return n > 0;
// }

// static boolean isneg(int n) {
// return n < 0;
// }

// }
