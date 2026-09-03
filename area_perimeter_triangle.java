// area of triangle ==>> 1/2 * b * h    
// perimeter of triangle ==>> a + b + c
// public class area_perimeter_triangle {

//     public static void main(String[] args) {
//         double a = 5, b = 6, c = 7, h = 4;
//         double area = 0.5 * b * h;
//         double perimeter = a + b + c;
//         System.out.println("Area of triangle is: " + area + "\nPerimeter of triangle is: " + perimeter);
//     }

// }

// method 2 using methods   & by using object to call the methodsIn()
// public class area_perimeter_triangle {
//     public static void main(String[] args) {
//         area_perimeter_triangle obj = new area_perimeter_triangle();
//         double a = obj.area(6, 4);
//         double p = obj.perimeter(5, 6, 7);
//         System.out.println("Area of triangle is: " + a + "\nPerimeter of triangle is: " + p);
//     }

//     public double area(double b, double h) {
//         return 0.5 * b * h;
//     }

//     public double perimeter(double a, double b, double c) {
//         return a + b + c;
//     }
// }

// method 3 using methods   & by using static methodsIn()
// public class area_perimeter_triangle {
//     public static void main(String[] args) {
//         double a = area(6, 4);
//         double p = perimeter(5, 6, 7);
//         System.out.println("Area of triangle is: " + a + "\nPerimeter of triangle is: " + p);
//     }

//     public static double area(double b, double h) {
//         return 0.5 * b * h;
//     }

//     public static double perimeter(double a, double b, double c) {
//         return a + b + c;
//     }
// }

// herons formula
// area of triangle ==>> √(s * (s - a) * (s - b) * (s - c))  where s = (a + b + c)/2
public class area_perimeter_triangle {
    public static void main(String[] args) {
        double a = 5, b = 6, c = 7;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double perimeter = a + b + c;
        System.out.println("Area of triangle is: " + area + "\nPerimeter of triangle is: " + perimeter);
    }
}
