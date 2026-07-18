// method 1
public class factorial_range {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.println(i + "!=" + fact);
        }
    }

}
