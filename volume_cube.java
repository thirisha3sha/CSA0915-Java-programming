// volume of cube V=a^3
// public class volume_cube {
// public static void main(String[] args) {
// double a = 5;
// double volume = Math.pow(a, 3);
// System.out.println("Volume of cube is: " + volume);
// }

// }

// method 2 by creating object of class
// public class volume_cube {
// public static void main(String[] args) {
// double a = 5;
// volume_cube obj = new volume_cube();
// double volume = obj.volume(a);
// System.out.println("Volume of cube is: " + volume);
// }

// double volume(double a) {
// return Math.pow(a, 3);
// }

// }

// method 3 without creating object of class
public class volume_cube {
    public static void main(String[] args) {
        double a = 5;
        double volume = volume(a);
        System.out.println("Volume of cube is: " + volume);
    }

    static double volume(double a) {
        return Math.pow(a, 3);
    }

}