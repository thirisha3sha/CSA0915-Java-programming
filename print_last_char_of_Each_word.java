// print last character of each word in a string
// public class print_last_char_of_Each_word {
//     public static void main(String[] args) {
//         String s = "hello2 hii 3sha";
//         String[] words = s.split(" ");
//         for (String i : words) {
//             System.out.print(i.charAt(i.length() - 1));
//         }
//     }

// }

// print last character of each word in a string .ignore space and digits
public class print_last_char_of_Each_word {
    public static void main(String[] args) {
        String s = "hey3 this is 3sha";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char c = word.charAt(word.length() - 1);
            if (Character.isDigit(c)) {
                continue;
            }
            System.out.print(c);

        }
    }
}