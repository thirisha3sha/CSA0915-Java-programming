public class perfect_num_range {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        for (int n = start; n <= end; n++) {
            int sum = 0;
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    sum += j;
                }
            }
            if (sum == n) {
                System.out.println(sum);
            }
        }
    }

}
