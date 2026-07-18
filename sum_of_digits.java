// method 1
// using while loop
// public class sum_of_digits {
// public static void main(String[] args) {
// int n = 1234;
// int sum = 0;
// while (n > 0) {
// sum += n % 10;
// n /= 10;
// }
// System.out.println("sum= " + sum);
// }

// }

// method 2
// using do while
// public class sum_of_digits {
// public static void main(String[] args) {
// int n = 1234;
// int sum = 0;
// do {
// sum += n % 10;
// n /= 10;
// } while (n > 0);
// System.out.println("sum= " + sum);
// }
// }

// method 3
// using recursion
// public class sum_of_digits {
// public static void main(String[] args) {
// int n = 12345;
// System.out.println("sum= " + sum(n));
// }

// static int sum(int n) {
// if (n == 0) {
// return 0;
// }
// return (n % 10) + sum(n / 10);
// }

// }

// method 3
// Using String Conversion

// public class sum_of_digits {
// public static void main(String[] args) {
// String n = "123456";
// int sum = 0;
// for (int i = 0; i < n.length(); i++) {
// sum += n.charAt(i) - '0';
// }
// System.out.println("sum= " + sum);

// }
// }

// method 4
// using int array
// public class sum_of_digits {
// public static void main(String[] args) {
// String n = "1234";
// int[] digits = new int[n.length()]; // declaring arry size
// int sum = 0;
// for (int i = 0; i < n.length(); i++) {
// digits[i] = n.charAt(i) - '0';
// sum += digits[i];
// }
// System.out.println("digits:");
// for (int digit : digits) {
// System.out.print(digit + " ");
// }
// System.out.println("\nsum: " + sum);
// }
// }

//method 5
//using character array
public class sum_of_digits {
    public static void main(String[] args) {
        String n = "1234";
        int sum = 0;
        char[] digits = n.toCharArray();
        for (char c : digits) {
            sum += Character.getNumericValue(c);
        }
        System.out.println("sum= " + sum);

    }
}