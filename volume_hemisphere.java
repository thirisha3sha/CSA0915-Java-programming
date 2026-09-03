// volume of hemisphere V=2/3*π*r^3
// public class volume_hemisphere {
// public static void main(String[] args) {
// double r = 5;
// double volume = (2.0 / 3) * Math.PI * Math.pow(r, 3);
// System.out.println("Volume of hemisphere is: " + volume);
// }

// }

// method 2 by creating object of class
// public class volume_hemisphere {
// public static void main(String[] args) {
// double r = 5;
// volume_hemisphere obj = new volume_hemisphere();
// double volume = obj.volume(r);
// System.out.println("Volume of hemisphere is: " + volume);
// }

// double volume(double r) {
// return (2.0 / 3) * Math.PI * Math.pow(r, 3);
// }
// }

// method 3 without creating object of class
public class volume_hemisphere {
    public static void main(String[] args) {
        double r = 5;
        double volume = volume(r);
        System.out.println("Volume of hemisphere is: " + volume);
    }

    static double volume(double r) {
        return (2.0 / 3) * Math.PI * Math.pow(r, 3);
    }
}