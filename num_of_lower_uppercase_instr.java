// find num of lower and upper case in a str
public class num_of_lower_uppercase_instr {
    public static void main(String[] args) {
        String s = "WelcoME To mY CoDE";
        int lower = 0, upper = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lower++;
            } else if (c >= 'A' && c <= 'Z') {
                upper++;
            }
        }
        System.out.println("num of lowercase:" + lower);
        System.out.println("num of uppercase:" + upper);
    }

}
