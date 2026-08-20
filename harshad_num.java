// harshad number is a number that is divisible by the sum of its digits.
// ex: 18=1+8=9   18%9=0 so 18 is a harshad number
public class harshad_num {
    public static void main(String[] args) {
        int num = 18;
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;

        }
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is not a Harshad Number");
        }
    }

}
