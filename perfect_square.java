// A perfect square number is a number that can be written as the product of an integer multiplied by itself.
// ex: 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
// public class perfect_square {
//     public static void main(String[] args) {
//         int num = 36;
//         double sqrt = Math.sqrt(num);
//         if (sqrt == Math.floor(sqrt)) {
//             System.out.println(num + " is a perfect square number");
//         } else {
//             System.out.println(num + " is not a perfect square number");
//         }
//     }

// }

// method 2
public class perfect_square {
    public static void main(String[] args) {
        int num = 36;
        int i = 1;
        while (i * i <= num) {
            if (i * i == num) {
                System.out.println(num + " is a perfect square number");
                break;
            }
            i++;
        }
        if (i * i > num) {
            System.out.println(num + " is not a perfect square number");
        }
    }
}
