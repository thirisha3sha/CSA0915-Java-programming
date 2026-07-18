/* 
Character Calculation	Result
'0'	  48 - 48	             0
'3'	  51 - 48	             3
'7'	  55 - 48	             7
'9'	   57 - 48	             9 */
public class convert_digitnum_into_words {
    public static void main(String[] args) {
        int n = 1234;
        String s = Integer.toString(n);
        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            System.out.print(words[digit] + " ");
        }

    }

}
