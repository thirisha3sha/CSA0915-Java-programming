// method 1
// using while and math
public class armstrong_range {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        for (int n = start; n <= end; n++) {
            int temp = n;
            int original = n;
            int count = String.valueOf(n).length();
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, count);
                temp /= 10;
            }
            if (sum == original) {
                System.out.print(original + " ");
            }

        }
    }

}
