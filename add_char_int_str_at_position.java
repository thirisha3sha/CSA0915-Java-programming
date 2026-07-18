// i/p hello
// char i/p: 2
// o/p: he2llo
// public class add_char_int_str_at_position {
// public static void main(String[] args) {
// String s = "hello";
// char c = '2';
// int pos = 2;
// String res = s.substring(0, pos) + c + s.substring(pos);
// System.out.println("Result: " + res);
// }

// }

// method 2

public class add_char_int_str_at_position {
    public static void main(String[] args) {
        String s = "hello";
        char c = '2';
        int pos = 5;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == pos) {
                res += c;
            }
            res += s.charAt(i);
        }
        // insert at end
        if (pos == s.length()) {
            res += c;
        }
        System.out.println("Result: " + res);

    }
}
