public class max_min_element_in_arr {
    public static void main(String[] args) {
        int arr[] = { 10, 34, 67, 2, 4, 897, 56, 23 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum element in the array is: " + min);
        System.out.println("Maximum element in the array is: " + max);
    }

}
