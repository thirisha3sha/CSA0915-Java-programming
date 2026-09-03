// volume of prism V=area of base * height
// public class volume_prism {
// public static void main(String[] args) {
// double area_of_base = 20, height = 10;
// double volume = area_of_base * height;
// System.out.println("Volume of prism is: " + volume);
// }

// }

// method 2 by creating object of class
// public class volume_prism {
// public static void main(String[] args) {
// double area_of_base = 20, height = 10;
// volume_prism obj = new volume_prism();
// double volume = obj.volume(area_of_base, height);
// System.out.println("Volume of prism is: " + volume);
// }

// double volume(double area_of_base, double height) {
// return area_of_base * height;
// }

// }

// method 3 without creating object of class
public class volume_prism {
    public static void main(String[] args) {
        double area_of_base = 20, height = 10;
        double volume = volume(area_of_base, height);
        System.out.println("Volume of prism is: " + volume);
    }

    static double volume(double area_of_base, double height) {
        return area_of_base * height;
    }

}