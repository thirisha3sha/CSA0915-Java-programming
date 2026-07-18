// public class sort_ascending_arr {
//     public static void main(String[] args) {
//         int arr[] = { 23, 56, 4, 67, 89, 907, 34, 23 };
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] > arr[j]) {
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
import java.util.Arrays;

public class sort_ascending_arr {
    public static void main(String[] args) {
        int arr[] = { 23, 56, 4, 67, 89, 907, 34, 23 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}