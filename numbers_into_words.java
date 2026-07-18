// 100 → One Hundred
// 101 → One Hundred and One
// 123 → One Hundred and Twenty Three

// method 1  (upto 99999)
public class numbers_into_words {
    public static void main(String[] args) {
        int n = 12534; // Twelve Thousand Five Hundred Thirty Four
        String[] ones = {
                "", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen" };
        String[] tens = {
                "", "", "Twenty", "Thirty", "Forty",
                "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if (n >= 1000) {
            int thousand = n / 1000;
            if (thousand < 20) {
                System.out.print(ones[thousand] + " Thousand ");
            } else {
                System.out.print(tens[thousand] + " ");
                if (thousand % 10 != 0) {
                    System.out.print(ones[thousand] + " ");
                }
                System.out.print(" Thousand ");
            }
            n %= 1000;
        }
        if (n >= 100) {
            System.out.print(ones[n / 100] + " Hundred ");
            n %= 100;
        }
        if (n >= 20) {
            System.out.print(tens[n / 10] + " ");
            n %= 10;
        }
        if (n > 0) {
            System.out.print(ones[n]);
        }
    }

}
