// method 1
// using reverse num logic
// public class palindrome {
// public static void main(String[] args) {
// int n = 12112;
// int temp = n;
// int rev = 0;
// while (n > 0) {
// int digit = n % 10;
// rev = rev * 10 + digit;
// n /= 10;
// }
// if (temp == rev) {
// System.out.println("palindrome!!");

// } else {
// System.out.println("Not palindrome");
// }
// }

// }

// method 2 for string
// using array
// public class palindrome {
// public static void main(String[] args) {
// String s = "121madam121";
// char[] arr = s.toCharArray();
// boolean flag = true;
// for (int i = 0; i < arr.length / 2; i++) {
// if (arr[i] != arr[arr.length - 1 - i]) {
// flag = false;
// break;
// }
// }
// System.out.println(flag ? "palindrome" : "not palindrome");

// }

// }

// method 3
// palindrome using recursion -for num
// public class palindrome {
// public static void main(String[] args) {
// int n = 1213;
// int res = reverse(n, 0);
// System.out.println((n == res) ? "palindrome" : "not palindrome");

// }

// static int reverse(int n, int rev) {
// if (n == 0) {
// return rev;
// }
// return reverse(n / 10, rev * 10 + n % 10);
// }
// }

// method 4
// palindrome string using loop with empty string
// public class palindrome {
// public static void main(String[] args) {
// String s = "madam";
// String rev = "";
// for (int i = s.length() - 1; i >= 0; i--) {
// rev += s.charAt(i);
// }
// System.out.println((s.equals(rev)) ? "palindrome" : "not palindrome");
// }
// }

// method 5
// using string charater comaparision
// public class palindrome {
// public static void main(String[] args) {
// String s = "madam";
// boolean flag = true;
// for (int i = 0; i < s.length() / 2; i++) {
// if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
// flag = false;
// break;
// }
// }
// System.out.println(flag ? "palindrome" : "not palindrome");
// }
// }

// method 6  for both num and string
// using Left and Right pointer (increment/decrement) method
public class palindrome {
    public static void main(String[] args)

    {
        String s = "121madam121";
        int left = 0;
        int right = s.length() - 1;
        boolean flag = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(flag ? " palindrome" : "not palindrome");
    }
}