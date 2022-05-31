import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        task8();
    }

    private static void task5() {
        int[][] matrix = new int[3][3];
        for (int[] row : matrix) {
            for (int column : row) {
                column = 1;
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr1[arr.length - 1 - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void task7() {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int j = arr[arr.length - 1 - i];
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void task8() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = -2;
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int s = arr[first] + arr[last];
            if (s == sum) {
                System.out.println(arr[first] + ", " + arr[last]);
                break;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
    }

    private static void task9() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = -2;
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int s = arr[first] + arr[last];
            if (s == sum) {
                System.out.println(arr[first] + ", " + arr[last]);
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
    }
}
