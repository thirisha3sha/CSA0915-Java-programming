// public class sort_descending_arr {
//     public static void main(String[] args) {
//         int arr[] = { 23, 56, 4, 67, 89, 907, 34, 23 };
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] < arr[j]) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

// }

// method 2
// using Arrays.sort()
// import java.util.Arrays;

// public class sort_descending_arr {
//     public static void main(String[] args) {
//         int arr[] = { 23, 56, 4, 67, 89, 907, 34, 23 };
//         Arrays.sort(arr);
//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// method 3
// using Arrays.sort() and Collections.reverseOrder()
import java.util.Arrays;
import java.util.Collections;

public class sort_descending_arr {
    public static void main(String[] args) {
        int arr[] = { 23, 56, 4, 67, 89, 907, 34, 23 };
        Integer arr1[] = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1, Collections.reverseOrder());
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}