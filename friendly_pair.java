// A Friendly Pair is a pair of numbers where the ratio of the sum of their proper divisors to the number itself is the same for both numbers.
// ex: 6 and 28 are friendly pair because sum of proper divisors of 6 is 1+2+3=6 and sum of proper divisors of 28 is 1+2+4+7+14=28
// 6/6 = 1 and 28/28 = 1 so 6 and 28 are friendly pair
// ex: 30 & 140        proper divisors of 30 = 1+2+3+5+6+10+15=42 and proper divisors of 140 = 1+2+4+5+7+10+14+20+28+35+70=196
// 42/30 = 1.4 and 196/140 = 1.4 so 30 and 140 are friendly pair
public class friendly_pair {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 28;
        int res1 = proper_divisiors_sum(n1);
        int res2 = proper_divisiors_sum(n2);
        if (res1 / n1 == res2 / n2) {
            System.out.println(n1 + " and " + n2 + " are Friendly Pair");
        } else {
            System.out.println(n1 + " and " + n2 + " are not Friendly Pair");
        }
    }

    static int proper_divisiors_sum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;

    }

}
