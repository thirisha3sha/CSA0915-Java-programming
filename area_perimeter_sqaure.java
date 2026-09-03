// area of square ==>> side * side
// perimeter of square ==>> 4 * side
// method 1 
// public class area_perimeter_sqaure {
//     public static void main(String[] args) {
//         double s = 5;
//         double a = s * s;
//         double p = 4 * s;
//         System.out.println("Area of square is: " + a + "\nPerimeter of square is: " + p);
//     }
// }

// method 2 using methods   & by using object to call the methodsIn()
// public class area_perimeter_sqaure {
//     public static void main(String[] args) {
//         area_perimeter_sqaure obj = new area_perimeter_sqaure();
//         double a = obj.area(5), p = obj.perimeter(5);
//         System.out.println("Area of square is: " + a + "\nPerimeter of square is: " + p);
//     }

//     public double area(double s) {
//         return s * s;
//     }

//     public double perimeter(double s) {
//         return 4 * s;
//     }

// }

// method 3 using methods   & by using static methodsIn()
public class area_perimeter_sqaure {

    public static void main(String[] args) {
        double a = area(5), p = perimeter(5);
        System.out.println("Area of square is: " + a + "\nPerimeter of square is: " + p);
    }

    public static double area(double s) {
        return s * s;
    }

    public static double perimeter(double s) {
        return 4 * s;
    }
}