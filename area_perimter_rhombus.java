// area of rhombus ==>> 1/2 * d1 * d2
// perimeter of rhombus ==>> 4 * side
// public class area_perimter_rhombus {
// public static void main(String[] args) {
// double d1 = 6, d2 = 8, side = 5;
// double area = 0.5 * d1 * d2;
// double perimeter = 4 * side;
// System.out.println("Area of rhombus is: " + area + "\nPerimeter of rhombus
// is: " + perimeter);
// }
// }

// method 2 using methods & by using object to call the methodsIn()
// public class area_perimter_rhombus {
// public static void main(String[] args) {
// area_perimter_rhombus obj = new area_perimter_rhombus();
// double a = obj.area(6, 8);
// double p = obj.perimeter(5);
// System.out.println("Area of rhombus is: " + a + "\nPerimeter of rhombus is: "
// + p);
// }

// public double area(double d1, double d2) {
// return 0.5 * d1 * d2;
// }

// public double perimeter(double side) {
// return 4 * side;
// }
// }

// method 3 using methods & by using static methodsIn()
public class area_perimter_rhombus {
    public static void main(String[] args) {
        double a = area(6, 8);
        double p = perimeter(5);
        System.out.println("Area of rhombus is: " + a + "\nPerimeter of rhombus is: " + p);
    }

    public static double area(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    public static double perimeter(double side) {
        return 4 * side;
    }
}