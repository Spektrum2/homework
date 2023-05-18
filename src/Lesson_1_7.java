public class Lesson_1_7 {
    public static void main(String[] args) {
        task7();
    }

//    Задание 1
//    Представим, что мы работаем в небольшой компании.
//    Данные сотрудников хранятся в неструктурированном формате, и бухгалтерия попросила написать программу, в которой можно работать с Ф. И. О. сотрудников.
//    Напишите четыре строки:
//    первая с именем firstName — для хранения имени;
//    вторая с именем middleName — для хранения отчества;
//    третья с именем lastName — для хранения фамилии;
//    четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
//    Выведите в консоль фразу: “ФИО сотрудника — ….”
//    В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
    private static void task1() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
//    Задание 2
//    Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны    Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
//    Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
//    В качестве строки с исходными данными используйте строку fullName.
//    Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
    private static void task2() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

//    Задание 3
//    Система, в которой мы работаем, не принимает символ “ё”.
//    Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
//    В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
//    Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
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
            word.append(symbol[i]).append(symbol2[i]);
        }
        String result = word.toString();
        System.out.println(result);
    }

    private static void task7() {
        String line = "aabccddefgghiijjkk";
        String[] symbol = line.split("");
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < line.length() - 1; i++) {
            if (symbol[i].equals(symbol[i + 1])) {
                word.append(symbol[i]);
            }
        }
        String result = word.toString();
        System.out.println(result);
    }
}
