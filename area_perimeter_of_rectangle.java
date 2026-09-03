// area of rectangle ==>> length * breadth
// perimeter of rectangle ==>> 2 * (length + breadth)
// method 1
// public class area_perimeter_of_rectangle {
//     public static void main(String[] args) {
//         double l = 5, b = 10;
//         double a = l * b;
//         double p = 2 * (l + b);
//         System.out.println("Area of rectangle is: " + a + "\nPerimeter of rectangle is: " + p);

//     }

// }

// method 2 using methods   & by using object to call the methodsIn()
// public class area_perimeter_of_rectangle {
//     public static void main(String[] args) {
//         area_perimeter_of_rectangle obj = new area_perimeter_of_rectangle();
//         double a = obj.area(5, 10);
//         double p = obj.perimeter(5, 10);
//         System.out.println("Area of rectangle is: " + a + "\nPerimeter of rectangle is: " + p);
//     }

//     public double area(double l, double b) {
//         return l * b;
//     }

//     public double perimeter(double l, double b) {
//         return 2 * (l + b);
//     }
// }

// method 3 using methods   & by using static methodsIn()
public class area_perimeter_of_rectangle {
    public static void main(String[] args) {
        double a = area(5, 10);
        double p = perimeter(5, 10);
        System.out.println("Area of rectangle is: " + a + "\nPerimeter of rectangle is: " + p);
    }

    public static double area(double l, double b) {
        return l * b;
    }

    public static double perimeter(double l, double b) {
        return 2 * (l + b);
    }
}