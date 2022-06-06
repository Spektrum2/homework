import java.time.LocalDate;

public class Lesson_1_8 {
    public static void main(String[] args) {
        task3();
    }

    private static void checkLeapYear(int year2) {
        if (year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0) {
            System.out.println(year2 + "  — високосный год");
        } else {
            System.out.println(year2 + " — не високосный год");
        }
    }

    private static void checkYearOS(int Year, int OS) {
        int currentYear = LocalDate.now().getYear();
        if (OS == 0) {
            if (Year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (Year < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    private static int calculateDays(int distance) {
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }

    private static void task1() {
        int year = 2020;
        checkLeapYear(year);
    }

    private static void task2() {
        int clientDeviceYear = 2022;
        int clientOS = 1;
        checkYearOS(clientDeviceYear, clientOS);

    }

    private static void task3() {
        int deliveryDistance = 96;
        int total = calculateDays(deliveryDistance);
        System.out.println("Потребуется дней: " + total);
    }

}
