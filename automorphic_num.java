// An Automorphic Number is a number whose square ends with the same number.
// ex: 5^2 = 25, 6^2 = 36, 76^2 = 5776, 25^2 = 625, 1^2 = 1
public class automorphic_num {
    public static void main(String[] args) {
        int num = 76;
        int square = num * num;
        int temp = num;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println(num + " is not an Automorphic Number");
                break;
            }
            temp /= 10;
            square /= 10;
        }
        if (temp == 0) {
            System.out.println(num + " is an Automorphic Number");
        }

    }

}
