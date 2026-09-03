// sector is a portion of a circle
// area of sector ==>> (θ*pi*r^2)/360
// perimeter of sector ==>> 2r+L , L=(θ*2*pi*r)/360
// public class area_perimeter_sector {
// public static void main(String[] args) {
// double r = 5, theta = 90;
// double area = (theta * Math.PI * r * r) / 360;
// double L = (theta * 2 * Math.PI * r) / 360;
// double perimeter = 2 * r + L;
// System.out.println("Area: " + area + "\nPerimeter: " + perimeter);

// }

// }

// method 2 without creating object of class
// public class area_perimeter_sector {
// public static void main(String[] args) {
// double r = 5, theta = 90;
// double area = area(r, theta);
// double L = length(r, theta);
// double perimeter = perimeter(r, L);
// System.out.println("Area: " + area + "\nPerimeter: " + perimeter);

// }

// static double area(double r, double theta) {
// return (theta * Math.PI * r * r) / 360;
// }

// static double length(double r, double theta) {
// return (theta * 2 * Math.PI * r) / 360;
// }

// static double perimeter(double r, double L) {
// return 2 * r + L;
// }
// }
// method 3 by creating object of class
public class area_perimeter_sector {
    public static void main(String[] args) {
        double r = 5, theta = 90;
        area_perimeter_sector obj = new area_perimeter_sector();
        double area = obj.area(r, theta);
        double L = obj.length(r, theta);
        double perimeter = obj.perimeter(r, L);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);

    }

    double area(double r, double theta) {
        return (theta * Math.PI * r * r) / 360;
    }

    double length(double r, double theta) {
        return (theta * 2 * Math.PI * r) / 360;
    }

    double perimeter(double r, double L) {
        return 2 * r + L;
    }
}