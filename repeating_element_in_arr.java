public class repeating_element_in_arr {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 9 };
        int res = find_repeating_element(arr);
        System.out.println((res == -1) ? "No repeating element" : res);
    }

    public static int find_repeating_element(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}