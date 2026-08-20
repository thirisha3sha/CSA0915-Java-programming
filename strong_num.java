// A Strong Number is a number where the sum of the factorials of its digits
// equals the original number.
// ex: 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145
// public class strong_num {
// public static void main(String[] args) {
// int num = 145;
// int original = num;
// int sum = 0;
// while (num > 0) {
// int digit = num % 10;
// int fact = 1;
// for (int i = 1; i <= digit; i++) {
// fact *= i;
// }
// sum += fact;
// num /= 10;
// }
// if (sum == original) {
// System.out.println(original + " is a Strong Number");
// } else {
// System.out.println(original + " is not a Strong Number");
// }
// }
// }
