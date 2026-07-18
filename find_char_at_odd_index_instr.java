// find char of a str at odd index
//i/p: hello I am a Student
//o/p: el  maSuet
public class find_char_at_odd_index_instr {
    public static void main(String[] args) {
        String s = "hello I am a Student";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

}
