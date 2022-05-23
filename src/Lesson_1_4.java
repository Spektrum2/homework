import java.sql.SQLOutput;

public class Lesson_1_4 {
    public static void main(String[] args) {
        task5();
    }

    public static void task1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
    }

    public static void task2() {
        for (int i = 1; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int before = 1822;
        int after = 2122;
        int i = 0;
        while (i < after) {
            i++;
            if (i % 79 == 0 && i > before) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ":");
            }

        }
    }

    public static void task5() {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        while (b < 34) {
            a = a + b;
            b = a + b;
            System.out.print(a + " " + b + " ");
        }
    }

}