public class Mane2 {
    public static void main(String[] args) {
        //Задача 2
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
}
