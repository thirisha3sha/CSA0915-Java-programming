/* find the avg of num according to the limits
i/p : enter the limit=5
arr=1,2,3,4,5
limit1=3
limit2=5

o/p=4     (3+4+5)/3 =4  
*/

import java.util.Scanner;

public class average_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter two limits:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > a && arr[i] < b) {
                sum = sum + arr[i];
                count++;
            }
        }
        int avg = sum / count;
        System.out.println("avg:" + avg);

    }

}
