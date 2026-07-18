// find the longest word in str
// i/p: hey hello how are you
// o/p: hello
// public class largest_word_in_str {
// public static void main(String[] args) {
// String s = "hey helloo hiiiii how are youuuu";
// String largest = "";
// String[] arr = s.split(" ");
// for (int i = 0; i < arr.length; i++) {
// if (arr[i].length() > largest.length()) {
// largest = arr[i];
// }
// }
// System.out.println(largest);
// }

// }

// find the longest word.if 2 are in same length then print second one
public class largest_word_in_str {
    public static void main(String[] args) {
        String s = "hey helloo hiiiii how are youuuu";
        String largest = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= largest.length()) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
