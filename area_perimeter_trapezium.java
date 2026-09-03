// area of trapezium ==>> 1/2 * (a + b) * h
// perimeter of trapezium ==>> a + b + c + d
// public class area_perimeter_trapezium {
//     public static void main(String[] args) {
//         double a = 5, b = 6, c = 7, d = 8, h = 4;
//         double area = 0.5 * (a + b) * h;
//         double perimeter = a + b + c + d;
//         System.out.println("Area of trapezium is: " + area + "\nPerimeter of trapezium is: " + perimeter);
//     }
// }

// method 2 using methods   & by using object to call the methodsIn()
// public class area_perimeter_trapezium {
//     public static void main(String[] args) {
//         area_perimeter_trapezium obj = new area_perimeter_trapezium();
//         double a = obj.area(5, 6, 4);
//         double p = obj.perimeter(5, 6, 7, 8);
//         System.out.println("Area of trapezium is: " + a + "\nPerimeter of trapezium is: " + p);
//     }

//     public double area(double a, double b, double h) {
//         return 0.5 * (a + b) * h;
//     }

//     public double perimeter(double a, double b, double c, double d) {
//         return a + b + c + d;
//     }
// }

// method 3 using methods   & by using static methodsIn()
public class area_perimeter_trapezium {
    public static void main(String[] args) {
        double a = area(5, 6, 4);
        double p = perimeter(5, 6, 7, 8);
        System.out.println("Area of trapezium is: " + a + "\nPerimeter of trapezium is: " + p);
    }

    public static double area(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    public static double perimeter(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}