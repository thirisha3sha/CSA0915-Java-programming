public class second_max_min_in_arr {
    public static void main(String[] args) {
        int arr[] = { 10, 34, 67, 2, 4, 897, 56, 23 };
        int min = arr[0];
        int max = arr[0];
        int second_min = arr[0];
        int second_max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                second_min = min;
                min = arr[i];
            } else if (arr[i] < second_min && arr[i] != min) {
                second_min = arr[i];
            }
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        System.out.println("Second Minimum element in the array is: " + second_min);
        System.out.println("Second Maximum element in the array is: " + second_max);
    }

}
