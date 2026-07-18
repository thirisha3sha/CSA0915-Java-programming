// count the num of vow,conso ,digit in a string
// i/p:welcome1234
// o/p: vow=3 cons=4 digits=4
// public class count_vow_conso_digit_instr {
// public static void main(String[] args) {
// String s = "Hello123@ World";
// int vow = 0, cons = 0, digits = 0, space = 0, special = 0;
// for (int i = 0; i < s.length(); i++) {
// char c = Character.toLowerCase(s.charAt(i));
// if (c >= 'a' && c < 'z') {
// if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
// vow++;
// } else {
// cons++;
// }
// } else if (c >= '0' && c <= '9') {
// digits++;
// } else if (c == ' ') {
// space++;
// } else {
// special++;
// }
// }
// System.out.println("vowels:" + vow + " consonants: " + cons + " digits:" +
// digits + " spaces:" + space
// + " special chars:" + special);
// }

// }

// method 2
public class count_vow_conso_digit_instr {
    public static void main(String[] args) {
        String s = "Hello123@ World";
        int vow = 0, cons = 0, digits = 0, space = 0, special = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vow++;
                } else {
                    cons++;
                }
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isWhitespace(c)) {
                space++;
            } else {
                special++;
            }
        }
        System.out.println("vowels:" + vow + " consonants: " + cons + " digits:" + digits + " spaces:" + space
                + " special chars:" + special);
    }

}
