public class Main {
    public static void main(String[] args) {
        task7();
    }

    public static void task1() {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2020;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 94;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println(deliveryDays);
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Тагоко номера месяца не сущетсвует");
        }
    }

    public static void task6() {
        int age = 19;
        int salary = 58_000;
        double limit;
        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }
        if (salary >= 50_000 && salary < 80_000) {
            limit = limit * 1.2;
        } else if (salary >= 80_000) {
            limit = limit * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }

    public static void task7() {
        int age = 19;
        int salary = 60_000;
        int wantedSum = 330_000;
        double rate;
        if (salary > 80_000) {
            rate = 10 - 0.7;
        } else {
            rate = 10;
        }
        if (age < 23) {
            rate = rate + 1;
        } else if (age >= 23 && age < 30) {
            rate = rate + 0.5;
        }
        double maxPay = (double) salary / 2;
        double maxPayMonth = (wantedSum + (wantedSum * (rate / 100))) / 12;
        if (maxPay > maxPayMonth) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. Платеж по кредиту " + maxPayMonth + " рублей. Одобрено");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPay + " рублей. Платеж по кредиту " + maxPayMonth + " рублей. Отказано");
        }
    }
}