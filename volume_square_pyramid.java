// volume of square pyramid V=1/3*a^2*h
// public class volume_square_pyramid {
// public static void main(String[] args) {
// double a = 5, h = 10;
// double v = (1.0 / 3) * Math.pow(a, 2) * h;
// System.out.println("Volume of square pyramid is: " + v);
// }

// }

// method 2 by creating object of class
// public class volume_square_pyramid {
// public static void main(String[] args) {
// double a = 5, h = 10;
// volume_square_pyramid obj = new volume_square_pyramid();
// double v = obj.volume(a, h);
// System.out.println("Volume of square pyramid is: " + v);
// }

// double volume(double a, double h) {
// return (1.0 / 3) * Math.pow(a, 2) * h;
// }
// }

// method 3 without creating object of class
public class volume_square_pyramid {
    public static void main(String[] args) {
        double a = 5, h = 10;
        double v = volume(a, h);
        System.out.println("Volume of square pyramid is: " + v);
    }

    static double volume(double a, double h) {
        return (1.0 / 3) * Math.pow(a, 2) * h;
    }
}