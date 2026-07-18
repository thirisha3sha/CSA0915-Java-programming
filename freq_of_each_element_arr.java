// public class freq_of_each_element_arr {
// public static void main(String[] args) {
// int arr[] = { 11, 2, 4, 5, 6, 4, 5, 6, 76, 8, 76, 76, 89, 10 };
// boolean[] visited = new boolean[arr.length];
// for (int i = 0; i < arr.length; i++) {
// if (visited[i]) {
// continue;
// }
// int count = 1;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// visited[j] = true;
// count++;
// }
// }
// System.out.println(arr[i] + "-->" + count);
// }
// }
// }

// method 2
// import java.util.Arrays;

// public class freq_of_each_element_arr {
// public static void main(String[] args) {
// int arr[] = { 11, 2, 4, 5, 6, 4, 5, 6, 76, 8, 76, 76, 89, 10 };
// Arrays.sort(arr);
// int count = 1;
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] == arr[i + 1]) {
// count++;
// } else {
// System.out.println(arr[i] + "-->" + count);
// count = 1;
// }
// }
// System.out.println(arr[arr.length - 1] + "-->" + count); // for last element
// }
// }

// method 3
import java.util.HashMap;

public class freq_of_each_element_arr {
    public static void main(String[] args) {
        int arr[] = { 11, 2, 4, 5, 6, 4, 5, 6, 76, 8, 76, 76, 89, 10 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
        System.out.println(map);
    }
}
