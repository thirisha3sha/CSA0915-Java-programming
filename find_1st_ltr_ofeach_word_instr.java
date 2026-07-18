
/* find the 1st ltr of each word in str
i/p:hello this is 3sha  
o/p: hti3 */
import java.util.Scanner;

public class find_1st_ltr_ofeach_word_instr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String s = " ";
        s = s + str.charAt(0);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                s = s + str.charAt(i + 1);
            }
        }
        System.out.println(s);
    }

}
