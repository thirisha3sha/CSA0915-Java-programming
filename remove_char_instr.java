
/* remove a char from  astr
i/p: hello
remove-e
o/p:hllo  */
import java.util.Scanner;

public class remove_char_instr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a str:");
        String s = sc.nextLine();
        System.out.println("enter a char to delete:");
        String c = sc.nextLine();
        String res = s.replace(c, "");
        System.out.println(res);
    }

}
