public class find_element_and_position_in_arr {
    public static void main(String[] args) {
        int arr[] = { 11, 2, 4563, 4, 5, 6, 76, 8, 76, 76, 89, 10 };
        int key = 76;
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }
        System.out.println("Position of " + key + " is: " + pos);
    }
}
