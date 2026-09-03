// volume of pyramid V=1/3*area of base * height
// public class volume_pyramid {
// public static void main(String[] args) {
// double area_of_base = 20, height = 10;
// double v = 1.0 / 3 * area_of_base * height;
// System.out.println("Volume of pyramid is: " + v);
// }

// }

// method 2 by creating object of class
// public class volume_pyramid {

//     public static void main(String[] args) {
//         double area_of_base = 20, height = 10;
//         volume_pyramid obj = new volume_pyramid();
//         double v = obj.volume(area_of_base, height);
//         System.out.println("Volume of pyramid is: " + v);
//     }

//     double volume(double area_of_base, double height) {
//         return 1.0 / 3 * area_of_base * height;
//     }
// }

// method 3 without creating object of class
public class volume_pyramid {
    public static void main(String[] args) {
        double area_of_base = 20, height = 10;
        double v = volume(area_of_base, height);
        System.out.println("Volume of pyramid is: " + v);
    }

    static double volume(double area_of_base, double height) {
        return 1.0 / 3 * area_of_base * height;
    }
}