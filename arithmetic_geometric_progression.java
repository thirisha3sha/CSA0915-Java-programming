/* If the sequence grows by adding/subtracting a fixed value, it's AP.
If it grows by multiplying/dividing by a fixed value, it's GP. */
// Arithmetic Progression (AP)
// AP is a sequence in which the difference between consecutive terms is constant.
//
// First term (a)
// Common difference (d)
//
// Formula:
// nth term = a + (n - 1) * d
//
// Example:
// a = 2
// d = 3,n=5
// Terms: 2, 5, 8, 11, 14

//   Geometric Progression (GP)

//  Definition:
//   A sequence in which the ratio between consecutive terms is the same.

//   Formula:
//   nth term = a * r^(n - 1)

//   where,
//   a = first term
//   r = common ratio
//   n = term number
// example : i/p: a = 2, r = 2, n = 5
// o/p: 2, 4, 8, 16, 32
// 4 ÷ 2 = 2
// 8 ÷ 4 = 2
// 16 ÷ 8 = 2
// 32 ÷ 16 = 2

// method 1
public class arithmetic_geometric_progression {
    public static void main(String[] args) {
        int a = 2, d = 3, n = 5, r = 2;
        int ap = a;
        int gp = a;
        System.out.println("AP: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(ap + " ");
            ap += d;
        }
        System.out.println("\nGP: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(gp + " ");
            gp *= r;
        }
    }
}
