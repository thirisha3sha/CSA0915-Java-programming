// replace all zeros with ones in given integer
// public class replace_zero_With_ones {
//     public static void main(String[] args) {
//         int num = 102020009;
//         String s = Integer.toString(num);
//         s = s.replace('0', '1');
//         int res = Integer.parseInt(s); // parseint means convert string to integer
//         System.out.println(res);

//     }
// }

// method 2
public class replace_zero_With_ones {
    public static void main(String[] args) {
        int num = 102020009;
        int res = 0;
        int p = 1;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                res = res + p * 1;
            } else {
                res = res + p * rem;
            }
            p = p * 10;
            num /= 10;
        }
        System.out.println(res);
    }
}
