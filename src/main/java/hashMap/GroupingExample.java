package hashMap;

import lombok.*;

import java.util.*;

/**
 * 3) Пример демонстрирует как можно выполнить группировку по какому-то критерию (Возраст в нашем случае)
 */
public class GroupingExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20),
                new Student("Bob", 22),
                new Student("Charlie", 20),
                new Student("David", 22)
        );

        Map<Integer, List<Student>> studentsByAge = new HashMap<>();

        for (Student student : students) {
                List<Student> studentList =  studentsByAge.getOrDefault(student.age, new ArrayList<>());
                studentList.add(student);
                studentsByAge.put(student.age,studentList );
        }

        System.out.println(studentsByAge);
        // Вывод: {20=[Alice, Charlie], 22=[Bob, David]}
    }
}

@RequiredArgsConstructor

class Student {
    @NonNull
    String name;
    @NonNull
    int age;

    @Override
    public String toString() {
        return name;
    }
}