
// method 1
// using for loop
// import java.util.Scanner;

// public class prime_number {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a num:");
// int n = sc.nextInt();
// boolean isprime = true;
// if (n <= 1) {
// isprime = false;
// } else {
// for (int i = 2; i < n; i++) {
// if (n % i == 0) {
// isprime = false;
// break;
// }

// }
// }
// if (isprime) {
// System.out.println("prime num");
// } else {
// System.out.println("not a prime num");
// }

// }

// }

// method 2
// using ternary operator
// public class prime_number {
// public static void main(String[] args) {
// int n = 7;
// boolean prime = true;
// if (n <= 1) {
// prime = false;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// prime = false;
// break;
// }
// }
// System.out.println(prime ? "prime num" : "not prime num");

// }
// }

// method 3
// using user defined method
// public class prime_number {
// public static void main(String[] args) {
// int n = 130;
// if (isprime(n)) {
// System.out.println("Prime num");
// } else {
// System.out.println("not a prime number");
// }

// }

// static boolean isprime(int n) {
// if (n <= 1) {
// return false;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }
// }