
/*
 * reverse the str
 * i/p: hello hii 3sha
 * o/p:aha iih olleh
 */
// method 1
// import java.util.Scanner;

// public class reverse_the_str {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a string:");
// String s = sc.nextLine();
// for (int i = s.length() - 1; i >= 0; i--) {
// System.out.print(s.charAt(i) + "");
// }
// }

// }

// method 2
import java.util.Scanner;

public class reverse_the_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res = s.charAt(i) + res;
        }
        System.out.println(res);
    }

}