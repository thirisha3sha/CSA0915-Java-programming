// area of semicircle ==>> (1/2)*pi*r^2
// perimeter of semicircle ==>> pi*r+r+r

// public class area_perimeter_semicircle {
// public static void main(String[] args) {
// double r = 5;
// double area = (1.0 / 2) * Math.PI * r * r;
// double perimeter = Math.PI * r + r + r;
// System.out.println("Area of semicircle is: " + area + "\nPerimeter of
// semicircle is:" + perimeter);
// }

// }

// method 2 creating object of class
// public class area_perimeter_semicircle {
// public static void main(String[] args) {
// double r = 5;
// area_perimeter_semicircle obj = new area_perimeter_semicircle();
// double area = obj.area(r);
// double perimeter = obj.perimeter(r);
// System.out.println("Area of semicircle is: " + area + "\nPerimeter of
// semicircle is:" + perimeter);
// }

// double area(double r) {
// return (1.0 / 2) * Math.PI * r * r;
// }

// double perimeter(double r) {
// return Math.PI * r + r + r;
// }
// }

// method 3 without creating object of class
public class area_perimeter_semicircle {
    public static void main(String[] args) {
        double r = 5;
        double area = area(r);
        double perimeter = perimeter(r);
        System.out.println("Area of semicircle is: " + area + "\nPerimeter of semicircle is:" + perimeter);
    }

    static double area(double r) {
        return (1.0 / 2) * Math.PI * r * r;
    }

    static double perimeter(double r) {
        return Math.PI * r + r + r;
    }
}