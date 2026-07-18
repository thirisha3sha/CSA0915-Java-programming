
/*
 * find the last letter of each eord in a str
 * i/p: hello hii how are you
 * o/p: oiweu
 */
// method 1
// import java.util.Scanner;

// public class find_lastletter_in_eachword_instr {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a string:");
// String s = sc.nextLine();
// String res = "";
// for (int i = 0; i < s.length(); i++) {
// if (s.charAt(i) == ' ') {
// res = res + s.charAt(i - 1);
// }
// }
// System.out.println(res + s.charAt(s.length() - 1));

// }
// }

// method 2
import java.util.Scanner;

public class find_lastletter_in_eachword_instr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (Character.isAlphabetic(s.charAt(i - 1))) {
                    res = res + s.charAt(i - 1);
                }
            } else if (i == s.length() - 1 && Character.isAlphabetic(s.charAt(i))) {
                res = res + s.charAt(i);

            }
        }
        System.out.println(res);

    }
}
