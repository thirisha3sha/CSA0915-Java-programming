// volume of frustum of cone  V=1/3*π*h*(r1^2+r2^2+r1*r2)
// public class volume_frustum_of_cone {
//     public static void main(String[] args) {
//         double r1 = 5, r2 = 3, h = 7;
//         double volume = (1.0 / 3) * Math.PI * h * (Math.pow(r1, 2) + Math.pow(r2, 2) + r1 * r2);
//         System.out.println("Volume of frustum of cone is: " + volume);
//     }
// }

// method 2 by creating object of class
// public class volume_frustum_of_cone {
//     public static void main(String[] args) {
//         double r1 = 5, r2 = 3, h = 7;
//         volume_frustum_of_cone obj = new volume_frustum_of_cone();
//         double volume = obj.volume(r1, r2, h);
//         System.out.println("Volume of frustum of cone is: " + volume);
//     }

//     double volume(double r1, double r2, double h) {
//         return (1.0 / 3) * Math.PI * h * (Math.pow(r1, 2) + Math.pow(r2, 2) + r1 * r2);     
//     }
// }

// method 3 without creating object of class
public class volume_frustum_of_cone {
    public static void main(String[] args) {
        double r1 = 5, r2 = 3, h = 7;
        double volume = volume(r1, r2, h);
        System.out.println("Volume of frustum of cone is: " + volume);
    }

    static double volume(double r1, double r2, double h) {
        return (1.0 / 3) * Math.PI * h * (Math.pow(r1, 2) + Math.pow(r2, 2) + r1 * r2);
    }
}