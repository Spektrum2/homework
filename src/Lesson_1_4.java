import java.sql.SQLOutput;

public class Lesson_1_4 {
    public static void main(String[] args) {
        task4();
    }

    //    Задание 1
//    Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
//    На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
//    Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
//    Не забудьте выполнить переход на новую строку между двумя циклами.
//    В результате программы вывод должен получиться следующий:
//            1 2 3 4 5 6 7 8 9 10
//            10 9 8 7 6 5 4 3 2 1
    private static void task1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    //    Задание 2
//    В вашей компании пятница является днем отчетным.
//    Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.
//    Условия задачи:
//    Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
//    Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
//            "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
//    В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
    private static void task2() {
        for (int i = 1; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

//    Задание 3
//    Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
//    Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
//    Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
//    Условия задачи:
//    В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
//    Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
//    В результате решения задачи в консоль должен вывестись следующий результат:
//            1896
//            1975
//            2054
    private static void task3() {
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


    private static void task4() {
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

//    Числа Фибоначчи
    private static void task5() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(a + " " + b + " ");
            a = a + b;
            b = a + b;
        }
    }

}
