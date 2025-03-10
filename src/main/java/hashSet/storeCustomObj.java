package hashSet;

import java.util.HashSet;
import java.util.Objects;
/**
 * 5) Если вы хотите хранить в HashSet пользовательские объекты,
 * необходимо переопределить методы equals() и hashCode(),
 * чтобы HashSet мог корректно сравнивать объекты.
 */
public class storeCustomObj {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("Alice", 25));
        set.add(new Person("Bob", 30));
        set.add(new Person("Alice", 25)); // Дубликат

        System.out.println("Люди в HashSet: " + set);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}