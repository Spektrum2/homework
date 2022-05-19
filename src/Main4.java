public class Main4 {
    public static void main(String[] args) {
        //Задача 4
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
}
