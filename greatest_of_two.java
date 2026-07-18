
// method 1 == using if else statement

// import java.util.Scanner;

// public class greatest_of_two {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the two nums:");
// int a = sc.nextInt();
// int b = sc.nextInt();
// if (a > b) {
// System.out.println("greatest num=" + a);
// } else if (b > a) {
// System.out.println("greatest num=" + b);
// } else {
// System.out.println("both are equal");
// }
// }

// }

// method 2
// using ternary operator

// import java.util.Scanner;

// public class greatest_of_two {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the two nums:");
// int a = sc.nextInt();
// int b = sc.nextInt();
// String res = (a > b) ? String.valueOf(a) : (b > a) ? String.valueOf(b) :
// "both are equal";
// int res1 = (a > b) ? a : (b > a) ? b : 0;
// String res2 = String.valueOf((a > b) ? a : (b > a) ? b : 0);
// System.out.println("greatest num=" + res);
// System.out.println("greatest num=" + res1);
// System.out.println("greatest num=" + res2);
// sc.close();
// }

// }

// method 3
// using math max

// import java.util.Scanner;

// public class greatest_of_two {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the two nums:");
// int a = sc.nextInt();
// int b = sc.nextInt();
// int res1 = Math.max(a, b);
// int res2 = Math.min(a, b);
// System.out.println("greatest num=" + res1);
// System.out.println("smallest num=" + res2);
// sc.close();

// }

// }

// method 4
// using method

// public class greatest_of_two {
// public static void main(String[] args) {
// int a = 100;
// int b = 2108;
// int res = greatest(a, b);
// System.out.println(res);
// }

// static int greatest(int a, int b) {
// return (a > b) ? a : (b > a) ? b : 0;
// }

// }

// method 5
// using switch case ==== by integer.compare method
/*
 * Condition Result
 * a > b 1
 * a < b -1
 * a == b 0
 */

// public class greatest_of_two{
// public static void main(String[] args)
// {
// int a=9348;
// int b=945;
// int res=Integer.compare(a,b);
// switch(res)
// {
// case 1:
// System.out.println("greatest num="+a);
// break;
// case -1:
// System.out.println("greatest num="+b);
// break;
// default:
// System.out.println("both are equal");
// }

// }

// }
