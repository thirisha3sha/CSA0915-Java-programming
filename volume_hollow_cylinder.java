// volume of hollow cylinder V=π*h*(R^2-r^2)
// public class volume_hollow_cylinder {
// public static void main(String[] args) {
// double R = 5, r = 3, h = 10;
// double volume = Math.PI * h * (Math.pow(R, 2) - Math.pow(r, 2));
// System.out.println("Volume of hollow cylinder is: " + volume);
// }

// }

// method 2 by creating object of class
// public class volume_hollow_cylinder {
// public static void main(String[] args) {
// double R = 5, r = 3, h = 10;
// volume_hollow_cylinder obj = new volume_hollow_cylinder();
// double volume = obj.volume(R, r, h);
// System.out.println("Volume of hollow cylinder is: " + volume);
// }

// double volume(double R, double r, double h) {
// return Math.PI * h * (Math.pow(R, 2) - Math.pow(r, 2));
// }
// }

// method 3 without creating object of class
public class volume_hollow_cylinder {
    public static void main(String[] args) {
        double R = 5, r = 3, h = 10;
        double volume = volume(R, r, h);
        System.out.println("Volume of hollow cylinder is: " + volume);
    }

    static double volume(double R, double r, double h) {
        return Math.PI * h * (Math.pow(R, 2) - Math.pow(r, 2));
    }
}