public class Lesson_1_7 {
    public static void main(String[] args) {
        task7();
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

    private static void task4() {
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    private static void task5() {
        String fullName = "ivanov ivan ivanovich";
        String[] symbol = fullName.split("");
        StringBuilder Character = new StringBuilder();
        for (int i = 0; i < symbol.length; i++) {
            if (i == 0) {
                symbol[i] = symbol[i].toUpperCase();
            } else if (symbol[i].contains(" ")) {
                symbol[i + 1] = symbol[i + 1].toUpperCase();
            }
            Character.append(symbol[i]);
        }
        String result = Character.toString();
        System.out.println(result);
    }

    private static void task6() {
        String a = "135";
        String b = "246";
        StringBuilder word = new StringBuilder();
        String[] symbol = a.split("");
        String[] symbol2 = b.split("");
        for (int i = 0; i < a.length(); i++) {
            word.append(symbol[i] + symbol2[i]);
        }
        String result = word.toString();
        System.out.println(result);
    }

    private static void task7() {
        String line = "aabccddefgghiijjkk";
        String[] symbol = line.split("");
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < line.length(); i+=2) {
            word.append(symbol[i]);
        }
        String result = word.toString();
        System.out.println(result);
    }
}
