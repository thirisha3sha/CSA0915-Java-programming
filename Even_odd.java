// method 1
// import java.util.Scanner;

// public class Even_odd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a num:");
// int n = sc.nextInt();
// if (n % 2 == 0) {
// System.out.println("even num");

// } else {
// System.out.println("odd num");
// }
// sc.close();

// }
// }

// method 2

// Usingb ternary operator
// import java.util.Scanner;

// public class Even_odd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a num:");
// int num = sc.nextInt();
// String result = (num % 2 == 0) ? "Even" : "Odd";
// System.out.println("The number is: " + result);

// sc.close();

// }
// }

// method 3

// Biwise operation
/*
 * binary num ends with 0 is even
 * binary num ends with 1 is odd num
 * ex: 8=even
 * 8 = 1000
 * 1 = 0001
 * -----------
 * & = 0000 --->>even
 * 7=odd
 * 7 = 0111
 * 1 = 0001
 * -----------
 * & = 0001 ---->>odd
 */
// import java.util.Scanner;

// public class Even_odd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a num:");
// int num = sc.nextInt();
// if ((num & 1) == 0) {
// System.out.println("Even num!");
// } else {
// System.out.println("odd num!");
// }
// sc.close();

// }
// }

// method 4

// switch case using switch expression/enhanced switch (->)
/*
 * Advantages of ->
 * ✅ No need for break
 * ✅ No accidental fall-through
 * ✅ Cleaner and shorter code
 * ✅ Multiple labels can be combined easily
 */
// import java.util.Scanner;

// public class Even_odd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// String res = switch (n % 2) {
// case 0 -> "even num";
// case 1, -1 -> "odd num";
// default -> "invalid num";
// };
// System.out.println(res);
// sc.close();
// }

// }

// method 6
// import java.util.Scanner;

// public class Even_odd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// switch (num % 2) {
// case 0 -> System.out.println("Even");
// case 1, -1 -> System.out.println("Odd");
// }
// }
// }

// method 7

// even or odd using a method
// import java.util.Scanner;

// public class Even_odd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// String res = even_odd(n);
// System.out.println(res);
// sc.close();
// }

// public static String even_odd(int n1) {
// if (n1 % 2 == 0)
// return "even num";
// else
// return "odd num";
// }
// }

// method 8

// even odd using boolean method
// import java.util.Scanner;

// public class Even_odd{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// boolean res = even_odd(n);
// if (res) {
// System.out.println("even num");
// } else {
// System.out.println("odd num");
// }
// sc.close();

// }

// public static boolean even_odd(int n1) {
// return n1 % 2 == 0;
// }

// }

// method 9
// even or odd by using boolean method

// public class Even_odd {
// public static void main(String[] args) {
// System.out.println(isEven(89));
// }

// static boolean isEven(int n) {
// return n % 2 == 0;
// }
// }

// o/p true
