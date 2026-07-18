// public class print_duplicates_and_its_count_in_arr {
// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4 };
// for (int i = 0; i < arr.length; i++) {
// int count = 1;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// count++;
// arr[j] = -1;
// }
// }
// if (count > 1 && arr[i] != -1) {
// System.out.println(arr[i] + " is repeated " + count + " times");
// }
// }

// }

// }

// print duplicates alone
public class print_duplicates_and_its_count_in_arr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
