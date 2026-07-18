
// i/p:CHNKSC
// O/P:CSK   -reverse the  from last after chn char 
import java.util.Scanner;

public class ipa_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        String str = "CHN";
        if (s.contains(str)) {
            for (int i = s.length() - 1; i >= 3; i--) {
                System.out.print(s.charAt(i));
            }
        } else {
            System.out.println(" none");
        }

    }

}
