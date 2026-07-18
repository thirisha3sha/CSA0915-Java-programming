// i/p:a=12,b=100  
// o/p:sum=810 count=15  // num divisible by 2 and 3.its sum and count
public class divisible_by_2_3 {
    public static void main(String[] args) {
        int a = 12, b = 100;
        int sum = 0, count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
    }

}
