// area of ellipse ==>> pi*a*b 
// perimeter of ellipse ==>> 2*pi*sqrt((a^2+b^2)/2)

// method 1
// public class area_perimeter_ellipse {
//     public static void main(String[] args)
//     {
//         double a=5,b=6;
//         double area=Math.PI*a*b;
//         double perimeter=2*Math.PI*Math.sqrt((a*a+b*b)/2);
//         System.out.println("Area of ellipse is: "+area+"\nPerimeter of ellipse is:"+perimeter);
//     }

// }

// method 2
// public class area_perimeter_ellipse {
//     public static void main(String[] args)
//     {
//         double a=5,b=6;
//         double area=area(a,b);
//         double perimeter=perimeter(a,b);
//         System.out.println("Area of ellipse is: "+area+"\nPerimeter of ellipse is:"+perimeter);
//     }
//     static double area(double a,double b)
//     {
//         return Math.PI*a*b;
//     }
//     static double perimeter(double a,double b)
//     {
//         return 2*Math.PI*Math.sqrt((a*a+b*b)/2);
//     }
// }

// method 3  by creating object of class
public class area_perimeter_ellipse {
    public static void main(String[] args) {
        double a = 5, b = 6;
        area_perimeter_ellipse obj = new area_perimeter_ellipse();
        double area = obj.area(a, b);
        double perimeter = obj.perimeter(a, b);
        System.out.println("Area of ellipse is: " + area + "\nPerimeter of ellipse is:" + perimeter);
    }

    double area(double a, double b) {
        return Math.PI * a * b;
    }

    double perimeter(double a, double b) {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }
}