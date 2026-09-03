// area of circle   ==>> π * r^2
// circumference of circle ==>> 2 * π * r

// method 1    using Math.PI
// public class area_circumference_circle {
//     public static void main(String[] args) {
//         double radius = 5;
//         double area = Math.PI * radius * radius;
//         double circumference = 2 * Math.PI * radius;
//         System.out.println("Area of circle is: " + area + "\nCircumference of circle is: " + circumference);

//     }

// }

// method 2    using 3.14   or 22.0/7.0 
// public class area_circumference_circle {
//     public static void main(String[] args) {
//         double radius = 5;
//         double area = 3.14 * radius * radius;
//         double circumference = 2 * 3.14 * radius;
//         System.out.println("Area of circle is: " + area + "\nCircumference of circle is: " + circumference);

//     }

// }

// method 3  Math.pow() function
public class area_circumference_circle {
    public static void main(String[] args) {
        double radius = 5;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area of circle is: " + area + "\nCircumference of circle is: " + circumference);

    }

}