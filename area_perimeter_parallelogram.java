// area of parallelogram ==>> b * h
// perimeter of parallelogram ==>> 2 * (a + b)
// public class area_perimeter_parallelogram {
//     public static void main(String[] args) {
//         double a = 5, b = 6, h = 4;
//         double area = b * h;
//         double perimeter = 2 * (a + b);
//         System.out.println("Area of parallelogram is: " + area + "\nPerimeter of parallelogram is: " + perimeter);
//     }
// }

// method 2 using methods   & by using object to call the methodsIn()
// public class area_perimeter_parallelogram {
//     public static void main(String[] args) {
//         area_perimeter_parallelogram obj = new area_perimeter_parallelogram();
//         double a = obj.area(6, 4);
//         double p = obj.perimeter(5, 6);
//         System.out.println("Area of parallelogram is: " + a + "\nPerimeter of parallelogram is: " + p);
//     }

//     public double area(double b, double h) {
//         return b * h;
//     }

//     public double perimeter(double a, double b) {
//         return 2 * (a + b);
//     }

// }

// method 3 using methods   & by using static methodsIn()
public class area_perimeter_parallelogram {
    public static void main(String[] args) {
        double a = area(6, 4);
        double p = perimeter(5, 6);
        System.out.println("Area of parallelogram is: " + a + "\nPerimeter of parallelogram is: " + p);
    }

    public static double area(double b, double h) {
        return b * h;
    }

    public static double perimeter(double a, double b) {
        return 2 * (a + b);
    }
}