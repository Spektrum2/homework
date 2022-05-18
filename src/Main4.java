public class Main4 {
    public static void main(String[] args) {
        //Задача 4
        int deliveryDistance = 94;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + 3);
        }else {
            System.out.println("На такое расстояние доставка не работает");
        }
    }
}
