// volume of cone  V=1/3*π*r^2*h
// public class volume_cone {
//     public static void main(String[] args) {
//         double r = 5, h = 10;
//         double volume = (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
//         System.out.println("Volume of cone is: " + volume);
//     }

// }

// method 2 by creating object of class
// public class volume_cone {
//     public static void main(String[] args) {
//         double r = 5, h = 10;
//         volume_cone obj = new volume_cone();
//         double volume = obj.volume(r, h);
//         System.out.println("Volume of cone is: " + volume);
//     }

//     double volume(double r, double h) {
//         return (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
//     }
// }

// method 3 without creating object of class
public class volume_cone {
    public static void main(String[] args) {
        double r = 5, h = 10;
        double v = volume(r, h);
        System.out.println("Volume of cone is: " + v);
    }

    static double volume(double r, double h) {
        return (1.0 / 3) * Math.PI * Math.pow(r, 2) * h;
    }
}