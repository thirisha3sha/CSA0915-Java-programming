// A prime factor is a prime number that divides another number exactly without leaving a remainder.
public class prime_factor_of_num {
    public static void main(String[] args) {
        int num = 28;
        System.out.print("Prime Factors of " + num + " are: ");
        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        if (num > 1) {
            System.out.print(num);
        }
    }

}
