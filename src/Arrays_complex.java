import java.util.Arrays;

public class Arrays_complex {
    public static void main(String[] args) {
        task5();
    }

    private static void task5() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[matrix.length - 1 - i][i] = 1;

        }
        for (int[] row : matrix) {
            for (int column : row) {

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
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = j;
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
                if (s < sum) {
                    first++;
                } else {
                    last--;
                }
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
                if (s < sum) {
                    first++;
                } else {
                    last--;
                }
            }
        }
    }
}
