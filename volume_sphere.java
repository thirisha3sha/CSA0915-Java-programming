// volume of sphere V=4/3*π*r^3
// public class volume_sphere {
// public static void main(String[] args) {
// double r = 5;
// double volume = (4.0 / 3) * Math.PI * Math.pow(r, 3);
// System.out.println("Volume of sphere is: " + volume);
// }

// }

// method 2 by creating object of class
// public class volume_sphere {
//     public static void main(String[] args) {
//         double r = 5;
//         volume_sphere obj = new volume_sphere();
//         double volume = obj.volume(r);
//         System.out.println("Volume of sphere is: " + volume);
//     }

//     double volume(double r) {
//         return (4.0 / 3) * Math.PI * Math.pow(r, 3);
//     }
// }

// method 3 without creating object of class
public class volume_sphere {
    public static void main(String[] args) {
        double r = 5;
        double volume = volume(r);
        System.out.println("Volume of sphere is: " + volume);
    }

    static double volume(double r) {
        return (4.0 / 3) * Math.PI * Math.pow(r, 3);
    }
}