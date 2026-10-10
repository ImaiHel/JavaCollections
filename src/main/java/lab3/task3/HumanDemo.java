package lab3.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HumanDemo {

    public static void run() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Иван", "Иванов", 30));
        humans.add(new Human("Пётр", "Петров", 25));
        humans.add(new Human("Анна", "Сидорова", 28));
        humans.add(new Human("Иван", "Иванов", 30)); // дубликат
        humans.add(new Human("Ольга", "Кузнецова", 35));

        System.out.println("Исходный список:");
        humans.forEach(System.out::println);

        // a) HashSet
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("\na) HashSet:");
        hashSet.forEach(System.out::println);

        // b) LinkedHashSet
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\nb) LinkedHashSet:");
        linkedHashSet.forEach(System.out::println);

        // c) TreeSet (использует compareTo из Human)
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\nc) TreeSet (по compareTo):");
        treeSet.forEach(System.out::println);

        // d) TreeSet с компаратором по фамилии
        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("\nd) TreeSet с компаратором по фамилии:");
        treeSetByLastName.forEach(System.out::println);

        // e) TreeSet с анонимным компаратором по возрасту
        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(humans);
        System.out.println("\ne) TreeSet с анонимным компаратором по возрасту:");
        treeSetByAge.forEach(System.out::println);

        // f) Комментарии-ответы
        System.out.println("\nf) Отличия:");
        System.out.println("HashSet — не сохраняет порядок, использует hashCode/equals, дубликаты удаляются.");
        System.out.println("LinkedHashSet — сохраняет порядок добавления, дубликаты удаляются.");
        System.out.println("TreeSet — сортирует элементы. Если compareTo возвращает 0, элемент считается дубликатом и не добавляется.");
        System.out.println("TreeSet с компаратором — сортировка по правилу компаратора. Важно: если компаратор считает два объекта равными, второй не добавится, даже если equals говорит, что они разные.");
    }
}