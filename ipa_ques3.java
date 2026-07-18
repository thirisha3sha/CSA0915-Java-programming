// take a int i/p and calculate the sum of its digit.if the sum is divisble by 3,then print true,else print false 
// i/p: 123   true
// i/p:1234 false
public class ipa_ques3 {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        if (sum % 3 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
