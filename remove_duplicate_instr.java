// remove duplicate instr in a str
// i/p: aabbccddeeff
// o/p: abcdef
public class remove_duplicate_instr {
    public static void main(String[] args) {
        String s = "aabbccddeeff";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (res.indexOf(c) == -1) {
                res += c;
            }
        }
        System.out.println("Result: " + res);
    }

}
