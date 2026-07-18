// public class freq_of_element_in_arr {
//     public static void main(String[] args) {
//         int arr[] = { 11, 2, 4563, 4, 5, 6, 76, 8, 76, 76, 89, 10 };
//         int key = 76;
//         int freq = 0;
//         for (int i : arr) {
//             if (i == key) {
//                 freq++;
//             }
//         }
//         System.out.println("Frequency of " + key + " is: " + freq);

//     }

// }

// freq of element and its position
public class freq_of_element_in_arr {
    public static void main(String[] args) {
        int arr[] = { 11, 2, 4563, 4, 5, 6, 76, 8, 76, 76, 89, 10 };
        int key = 76;
        int freq = 0;
        int pos[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos[freq] = i;
                freq++;
            }
        }
        System.out.println("Frequency of " + key + " is: " + freq);
        System.out.print("Positions of " + key + ": ");
        for (int i = 0; i < freq; i++) {
            System.out.print(pos[i] + " ");
        }
    }
}