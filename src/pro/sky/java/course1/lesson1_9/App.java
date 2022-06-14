package pro.sky.java.course1.lesson1_9;

public class App {
    public static void main(String[] args) {
        Author king = new Author("Стивен", "Кинг");
        Author tolstoy = new Author("Лев", "Толсой");
        Book deadZone = new Book("Мертвая зона", king,1978);
        Book warAndPeace = new Book("Война и мир", tolstoy, 1868);
        System.out.println(deadZone.getName() + ", " + deadZone.getYearPublishing() + ", " + deadZone.getAuthorName(deadZone));
        System.out.println(warAndPeace.getName() + ", " + warAndPeace.getYearPublishing() + ", " + warAndPeace.getAuthorName(warAndPeace));
    }
}
