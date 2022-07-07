package pro.sky.java.course2.lesson2_1;

import java.util.Arrays;

public class Lesson2_1 {
    public static void main(String[] args) {
        Integer[] value = {3, 4};
        changeValue(value);
        System.out.println(Arrays.toString(value));
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println("person = " + person);
    }

    private static void changeValue(Integer[] value) {
        value[0] = 99;
    }
    private static void changePerson(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
}
