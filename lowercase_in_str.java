
/*
 * find the num of lowercase in a str
 * i/p:WelcoME To mY CoDE
 * O/P:7
 */
// import java.util.Scanner;

// public class lowercase_in_str {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a str:");
// String s = sc.nextLine();
// char[] arr = s.toCharArray();
// int count = 0;
// for (int i = 0; i < s.length(); i++) {
// if (Character.isLowerCase(arr[i])) {
// count++;
// }

// }
// System.out.println("num of lowercae in the given string: " + count);

// }

// }

// method 2
// using a<z condition
public class lowercase_in_str {

    public static void main(String[] args) {
        String s = "WelcoME To mY CoDE";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c < 'z') {
                count++;

            }
        }
        System.out.println("num of lowercae in the given string: " + count);

    }
}