
/* find the characters of a string at odd index
i/p: Hello World
o/p:el ol */
import java.util.Scanner;

public class find_char_in_odd_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a str:");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(s.charAt(i));
            }
        }
    }

}
