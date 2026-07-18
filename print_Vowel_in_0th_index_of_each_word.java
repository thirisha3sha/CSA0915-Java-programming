// enter a str and print all vowel as it is which is available on the str in the 0 index.
// i/p: hello I am a Student
//o/p: Iaa
public class print_Vowel_in_0th_index_of_each_word {
    public static void main(String[] args) {
        String s = "hello I am a Student";
        String res = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                    || c == 'O' || c == 'U') {
                res = res + c;
            }
        }
        System.out.println(res);
    }

}
