// abundant number is a number for which the sum of its proper divisors is greater than the number itself.
// ex: 12:    1+2+3+4+6 =16    now  12<16   so 12 is an abundant number   
public class abundant_num {
    public static void main(String[] args) {
        int num = 12;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println((sum > num) ? num + " is an Abundant Number" : num + " is not an Abundant Number");

    }

}
