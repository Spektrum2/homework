public class Lesson_1_7 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task3() {
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        StringBuilder fullName2 = new StringBuilder();
        String[] words = fullName.split("");
        for (int i = 0; i < fullName.length(); i++) {
            if (words[i].contains("ё")) {
                words[i] = "е";
            }
            fullName2.append(words[i]);
        }
        String result = fullName2.toString();
        System.out.println("Данные ФИО сотрудника — " + result);
    }
}
