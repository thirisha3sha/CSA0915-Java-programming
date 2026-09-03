// volume of hollow sphere V=4/3*π*(R^3-r^3)
// public class volume_hollow_sphere {
// public static void main(String[] args) {
// double R = 5, r = 3;
// double volume = (4.0 / 3) * Math.PI * (Math.pow(R, 3) - Math.pow(r, 3));
// System.out.println("Volume of hollow sphere is: " + volume);
// }

// }

// method 2 by creating object of class
// public class volume_hollow_sphere {
// public static void main(String[] args) {
// double R = 5, r = 3;
// volume_hollow_sphere obj = new volume_hollow_sphere();
// double volume = obj.volume(R, r);
// System.out.println("Volume of hollow sphere is: " + volume);
// }

// double volume(double R, double r) {
// return (4.0 / 3) * Math.PI * (Math.pow(R, 3) - Math.pow(r, 3));
// }

// }

// method 3 without creating object of class
public class volume_hollow_sphere {
    public static void main(String[] args) {
        double R = 5, r = 3;
        double volume = volume(R, r);
        System.out.println("Volume of hollow sphere is: " + volume);
    }

    static double volume(double R, double r) {
        return (4.0 / 3) * Math.PI * (Math.pow(R, 3) - Math.pow(r, 3));
    }
}