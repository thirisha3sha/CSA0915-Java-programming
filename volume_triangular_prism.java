// volume of triangular prism V=1/2*b*h*H
// public class volume_triangular_prism {
// public static void main(String[] args) {
// double b = 5, h = 6, H = 7;
// double volume = (1.0 / 2) * b * h * H;
// System.out.println("Volume of triangular prism is: " + volume);
// }

// }

// method 2 by creating object of class
// public class volume_triangular_prism {
//     public static void main(String[] args) {
//         double b = 5, h = 6, H = 7;
//         volume_triangular_prism obj = new volume_triangular_prism();
//         double volume = obj.volume(b, h, H);
//         System.out.println("Volume of triangular prism is: " + volume);
//     }

//     double volume(double b, double h, double H) {
//         return (1.0 / 2) * b * h * H;
//     }
// }

// method 3 without creating object of class
public class volume_triangular_prism {
    public static void main(String[] args) {
        double b = 5, h = 6, H = 7;
        double volume = volume(b, h, H);
        System.out.println("Volume of triangular prism is: " + volume);
    }

    static double volume(double b, double h, double H) {
        return (1.0 / 2) * b * h * H;
    }
}