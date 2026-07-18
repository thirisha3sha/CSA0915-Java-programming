// enter a str and print all vowel 
// i/p: hello I am a Student
//o/p: eoIaaue

public class print_vowel_in_the_str {
    public static void main(String[] args) {
        String s = "hello I am a Student";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                    || c == 'O' || c == 'U') {
                res = res + c;
            }
        }
        System.out.println(res);
    }

}
