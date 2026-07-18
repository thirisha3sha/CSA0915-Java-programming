// A year is a Leap Year if:

// It is divisible by 400, OR
// It is divisible by 4 but not divisible by 100

// method 1
// leap year using if else
// import java.util.Scanner;

// public class leap_yr {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter a year:");
// int year = sc.nextInt();
// if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
// System.out.println("leap year");
// } else {
// System.out.println("not a leap year!");
// }
// }
// }

// method 2
// using nested if
// public class leap_yr {
// public static void main(String[] args) {
// int year = 1900;
// if (year % 4 == 0) {
// if (year % 100 == 0) {
// if (year % 400 == 0) {
// System.out.println("leap year!");
// } else {
// System.out.println("not a leap year!");
// }
// } else {
// System.out.println("leap year");
// }
// } else {
// System.out.println("not a leap year!!");

// }
// }
// }

// method 3
// using ternary operator

// public class leap_yr {
//     public static void main(String[] args) {
//         int year = 2000;
//         String res = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "leap year" : "not a leap year";
//         System.out.println(res);
//     }
// } 

// method 4
//using boolean variable
// public class leap_yr {
//     public static void main(String[] args) {
//         int year = 2001;
//         boolean res = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
//         if (res)
//             System.out.println("leap year");
//         else
//             System.out.println("not a leap year");
//     }
// }

// method 5
// using Year class
// import java.time.Year;

// public class leap_yr {
//     public static void main(String[] args) {
//         int year = 2024;
//         if (Year.isLeap(year)) {
//             System.out.println("leap year");
//         } else {
//             System.out.println("not a leap year");
//         }
//     }
// }

// method 6
// by using user defined method
public class leap_yr {
    public static void main(String[] args) {
        int year = 2026;
        if (isleap(year)) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }

    static boolean isleap(int year) {
        return ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0));
    }
}