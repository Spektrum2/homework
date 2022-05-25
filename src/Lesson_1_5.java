public class Lesson_1_5 {
    public static void main(String[] args) {
        task4();
    }

    static void task1() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[]{4, 5, 6};
    }

    static void task2() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[]{4, 5, 6, 7};
        for (int i = 0; i < arr1.length; i++) {
            if (i != arr1.length - 1) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();
        for (int j = 0; j < arr2.length; j++) {
            if (j != arr2.length - 1) {
                System.out.print(arr2[j] + ", ");
            } else {
                System.out.print(arr2[j]);
            }
        }
        System.out.println();
        for (int v = 0; v < arr3.length; v++) {
            if (v != arr3.length - 1) {
                System.out.print(arr3[v] + ", ");
            } else {
                System.out.print(arr3[v]);
            }
        }
    }

    static void task3() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = new int[]{4, 5, 6, 7};
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();
        for (int j = arr2.length - 1; j >= 0; j--) {
            if (j != 0) {
                System.out.print(arr2[j] + ", ");
            } else {
                System.out.print(arr2[j]);
            }
        }
        System.out.println();
        for (int v = arr3.length - 1; v >= 0; v--) {
            if (v != 0) {
                System.out.print(arr3[v] + ", ");
            } else {
                System.out.print(arr3[v]);
            }
        }
    }

    static void task4() {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i]++;
            }
            System.out.println(arr1[i]);
        }
    }
}


