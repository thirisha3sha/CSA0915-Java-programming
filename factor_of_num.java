public class factor_of_num {
    public static void main(String[] args) {
        int num = 28;
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
