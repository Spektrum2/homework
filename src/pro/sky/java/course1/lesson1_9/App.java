package pro.sky.java.course1.lesson1_9;

public class App {
    public static void main(String[] args) {
        Author king = new Author("Стивен", "Кинг");
        Author author1 = new Author("Стивен", "Кинг");
        Author tolstoy = new Author("Лев", "Толсой");
        Book deadZone = new Book("Мертвая зона", king, 1978);
        Book warAndPeace = new Book("Война и мир", tolstoy, 1868);
        Book warAndPeace2 = new Book("Война и мир", tolstoy, 1868);
        System.out.println(king);
        System.out.println(tolstoy);
        System.out.println(deadZone);
        System.out.println(warAndPeace);
    }
}
