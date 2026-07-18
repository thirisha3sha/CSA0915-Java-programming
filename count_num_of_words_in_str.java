
/*  count the num of word in string
i/p: hii hello this is thrisha practicing java in visual.
o/p:9 */
import java.util.Scanner;

public class count_num_of_words_in_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != " ") {
                count++;

            }
        }
        System.out.println("num of words in str:" + count);

    }
}
