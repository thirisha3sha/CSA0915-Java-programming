// hcf/ gcd  === highest common factor/ greatest common divisor
// The largest number that divides two or more numbers exactly.
// lcm (least common multiple) - The smallest number that is a multiple of two or more numbers.
// i/p: 12,18
// o/p: hcf=6, lcm=36
// lcm=(a*b)/hcf
// hcf example: 12=2*2*3, 18=2*3*3, hcf=2*3=6
// lcm example: 12=2*2*3, 18=2*3*3, lcm=2*2*3*3=36
// hcf : 12,18   factors of 12=1,2,3,4,6,12    factors of 18=1,2,3,6,9,18   common factors=1,2,3,6   hcf=6      
// lcm: 12,18   multiples of 12=12,24,36,48,60,72,84,96,108,120   multiples of 18=18,36,54,72,90,108   common multiples=36,72,108   lcm=36
// method 1

// public class lcm_hcf {
//     public static void main(String[] args) {
//         int a = 12, b = 18;
//         int x = a;
//         int y = b;
//         while (y != 0) {
//             int temp = y;
//             y = x % y;
//             x = temp;
//         }
//         int hcf = x;
//         int lcm = (a * b) / hcf;
//         System.out.println("hcf=" + hcf);
//         System.out.println("lcm=" + lcm);

//     }

// }

// method 2 using recursion
public class lcm_hcf {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int hcf = hcf(a, b);
        int lcm = (a * b) / hcf;
        System.out.println("hcf=" + hcf);
        System.out.println("lcm=" + lcm);
    }

    static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }

}