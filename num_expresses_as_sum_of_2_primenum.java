// check if a number can be expressed as sum of two prime numbers
// ex: 10 = 3 + 7 (both 3 and 7 are prime) 
// ex 2: 12=5+7  (both 5 and 7 are prime)
public class num_expresses_as_sum_of_2_primenum {
    public static void main(String[] args) {
        int num = 12;
        boolean res = false;
        for (int i = 2; i < num; i++) {
            if (isprime(i) && isprime(num - i)) {
                res = true;
                System.out.println(num + " can be expressed as sum of two prime numbers: " + i + " and " + (num - i));
                break;
            }
        }
        if (!res) {
            System.out.println(num + " cannot be expressed as sum of two prime numbers.");
        }
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
