// method 1
// using for loop
// public class prime_num_range {
// public static void main(String[] args) {
// int start = 5;
// int end = 20;
// for (int num = start; num <= end; num++) {
// if (num <= 1) {
// continue;
// }
// boolean prime = true;
// for (int i = 2; i < num; i++) {
// if (num % i == 0) {
// prime = false;
// break;
// }
// }
// if (prime) {
// System.out.print(num + " ");
// }
// }
// }

// }

// method 2
public class prime_num_range1 {
    public static void main(String[] args) {
        int start = 5;
        int end = 20;
        for (int num = start; num <= end; num++) {
            if (num <= 1) {
                continue;
            }
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
            }
        }
    }

}
