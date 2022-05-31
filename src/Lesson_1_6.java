import java.util.Arrays;

public class Lesson_1_6 {
    public static void main(String[] args) {
        task4();
    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    private static void task2() {
        int[] arr = generateRandomArray();
        int maxSum = -1;
        int minSum = 200_001;
        for (int current : arr) {
            if (current > maxSum) {
                maxSum = current;
            } else if (current < minSum) {
                minSum = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");
    }

    private static void task4() {
        int[] arr = generateRandomArray();
        int average = 0;
        for (int current : arr) {
            average += current;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (double) average / arr.length + " рублей");
    }

    private static void task5() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}
