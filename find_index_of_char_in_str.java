// str i/p: xplore
// char i/p: o
// o/p: 3
// find the index of char in str
// method 1

// public class find_index_of_char_in_str {
// public static void main(String[] args) {
// String s = "xplore";
// char c = 'o';
// int index = s.indexOf(c);
// System.out.println("Index: " + index);
// }

// }

// method 2
public class find_index_of_char_in_str {
    public static void main(String[] args) {
        String s = "xplore";
        char c = 'o';
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);
    }
}