// num of space and char in a str
// i/p: Hi his is 3sha
// o/p: num of space: 3
// o/p: num of char: 11
// public class count_space_and_char_instr {
// public static void main(String[] args) {
// String s = "Hi his is 3sha";
// int space = 0, count = 0;
// for (int i = 0; i < s.length(); i++) {
// if (s.charAt(i) == ' ') {
// space++;
// } else {
// count++;
// }
// }
// System.out.println("num of space: " + space);
// System.out.println("num of char: " + count);
// }

// }

// considering only alphabetical
// public class count_space_and_char_instr {
//     public static void main(String[] args) {
//         String s = "Hi his is 3sha";
//         int space = 0, charCount = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ' ') {
//                 space++;
//             } else if (Character.isLetter(s.charAt(i))) {
//                 charCount++;

//             }
//         }
//         System.out.println("num of space: " + space);
//         System.out.println("num of char: " + charCount);
//     }
// }

// method 3
public class count_space_and_char_instr {
    public static void main(String[] args) {
        String s = "Hi his is 3sha";
        int space = 0, charCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                space++;
            } else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                charCount++;

            }
        }
        System.out.println("num of space: " + space);
        System.out.println("num of char: " + charCount);
    }
}