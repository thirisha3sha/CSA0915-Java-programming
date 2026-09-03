// volume of cylinder V=π*r^2*h
// public class volume_cylinder {
//     public static void main(String[] args) {
//         double r = 5, h = 10;
//         double volume = Math.PI * Math.pow(r, 2) * h;
//         System.out.println("Volume of cylinder is: " + volume);
//     }
// }

// method 2 by creating object of class
// public class volume_cylinder {
//     public static void main(String[] args) {
//         double r = 5, h = 10;
//         volume_cylinder obj = new volume_cylinder();
//         double volume = obj.volume(r, h);
//         System.out.println("Volume of cylinder is: " + volume);
//     }

//     double volume(double r, double h) {
//         return Math.PI * Math.pow(r, 2) * h;
//     }

// }

// method 3 without creating object of class
public class volume_cylinder {
    public static void main(String[] args) {
        double r = 5, h = 10;
        double volume = volume(r, h);
        System.out.println("Volume of cylinder is: " + volume);
    }

    static double volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

}
