// volume of cuboid  V=l*b*h
// public class volume_cuboid {
//     public static void main(String[] args) {
//         double l = 5, b = 6, h = 7;
//         double volume = l * b * h;
//         System.out.println("Volume of cuboid is: " + volume);
//     }

// }

// method 2 by creating object of class
// public class volume_cuboid {
//     public static void main(String[] args) {
//         double l = 5, b = 6, h = 7;
//         volume_cuboid obj = new volume_cuboid();
//         double volume = obj.volume(l, b, h);
//         System.out.println("Volume of cuboid is: " + volume);
//     }

//     double volume(double l, double b, double h) {
//         return l * b * h;
//     }

// }

// method 3 without creating object of class
public class volume_cuboid {
    public static void main(String[] args) {
        double l = 5, b = 6, h = 7;
        double volume = volume(l, b, h);
        System.out.println("Volume of cuboid is: " + volume);
    }

    static double volume(double l, double b, double h) {
        return l * b * h;
    }

}