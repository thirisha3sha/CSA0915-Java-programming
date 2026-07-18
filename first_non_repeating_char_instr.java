// find the 1st non repeating char in a str
// i/p: hello
// o/p: h
// public class first_non_repeating_char_instr {
// public static void main(String[] args) {
// String s = "hello";
// for (int i = 0; i < s.length(); i++) {
// int count = 0;
// for (int j = 0; j < s.length(); j++) {
// if (s.charAt(i) == s.charAt(j)) {
// count++;
// }
// }
// if (count == 1) {
// System.out.println(s.charAt(i));
// break;
// }
// }
// }

// }

// i/p: hello
// o/p: hel    -->> after finding the duplicate break and print the characters
public class first_non_repeating_char_instr {
    public static void main(String[] args) {
        String s = "hello";
        String res = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    res = res + s.charAt(i);
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                        break;
                    }
                }
                if (count > 0) {
                    break;
                }
            }

        }
        System.out.println(res);
    }
}