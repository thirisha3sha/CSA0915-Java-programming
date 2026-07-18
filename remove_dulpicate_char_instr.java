//remove duplicate chars from str
// i/p: hello hey guys
// o/p;helo y gus

public class remove_dulpicate_char_instr {
    public static void main(String[] args) {
        String s = "hello hey guys";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {// to skip space
                res += ' ';
                continue;
            }
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    res = res + s.charAt(i);
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        break;
                    }

                }
            }
        }
        System.out.println(res);
    }
}
