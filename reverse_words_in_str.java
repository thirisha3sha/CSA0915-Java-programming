
/* reverse the words in string
i/p: hii this is thirishaaa 
o/p :thirishaaa is this hii */
import java.util.Scanner;

public class reverse_words_in_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }

}
