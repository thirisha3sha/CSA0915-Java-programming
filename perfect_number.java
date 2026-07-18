/*  perfect num =>>A Perfect Number is a positive integer that is equal to the sum of its proper divisors (excluding itself).

Examples:

6 = 1 + 2 + 3 

28 = 1 + 2 + 4 + 7 + 14  */
// method 1
// public class perfect_number {
//     public static void main(String[] args) {
//         int n = 26;
//         int sum = 0;
//         for (int i = 1; i < n; i++) {
//             if (n % i == 0) {
//                 sum = sum + i;
//             }
//         }
//         System.out.println((sum == n) ? "perfect num" : "not perfect num");
//     }
// }

// method 2
public class perfect_number {

    public static void main(String[] args) {
        System.out.println((isperfect(282)) ? "perfect num" : "not perfect");
    }

    static boolean isperfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}