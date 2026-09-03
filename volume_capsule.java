// volume of capsule  V=π*h*(3r^2+h^2)/6
// public class volume_capsule {
//     public static void main(String[] args) {
//         double r = 5, h = 10;
//         double volume = Math.PI * h * (3 * Math.pow(r, 2) + Math.pow(h, 2)) / 6;
//         System.out.println("Volume of capsule is: " + volume);
//     }

// }

// method 2 by creating object of class
// public class volume_capsule {
//     public static void main(String[] args) {
//         double r = 5, h = 10;
//         volume_capsule obj = new volume_capsule();
//         double volume = obj.volume(r, h);
//         System.out.println("Volume of capsule is: " + volume);
//     }

//     double volume(double r, double h) {
//         return Math.PI * h * (3 * Math.pow(r, 2) + Math.pow(h, 2)) / 6;
//     }
// }

// method 3 without creating object of class
public class volume_capsule {
    public static void main(String[] args) {
        double r = 5, h = 10;
        double volume = volume(r, h);
        System.out.println("Volume of capsule is: " + volume);
    }

    static double volume(double r, double h) {
        return Math.PI * h * (3 * Math.pow(r, 2) + Math.pow(h, 2)) / 6;
    }
}