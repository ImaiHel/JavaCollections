package lab3.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class CollectionsDemo {

    public static void run(int n) {
        // a) массив из N случайных чисел от 0 до 100
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101); // 0..100
        }
        System.out.println("a) Массив: " + Arrays.toString(array));

        // b) на основе массива создаём список List
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        System.out.println("b) Список: " + list);

        // c) сортировка по возрастанию
        Collections.sort(list);
        System.out.println("c) По возрастанию: " + list);

        // d) сортировка в обратном порядке
        Collections.reverse(list);
        System.out.println("d) В обратном порядке: " + list);

        // e) перемешать список
        Collections.shuffle(list);
        System.out.println("e) Перемешанный: " + list);

        // f) циклический сдвиг на 1 элемент
        Collections.rotate(list, 1);
        System.out.println("f) Сдвиг на 1: " + list);

        // g) только уникальные элементы
        Set<Integer> unique = new HashSet<>(list);
        System.out.println("g) Уникальные: " + unique);

        // h) только дублирующиеся элементы
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int value : list) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }
        System.out.println("h) Дубликаты: " + duplicates);

        // i) из списка получить массив
        Integer[] backToArray = list.toArray(new Integer[0]);
        System.out.println("i) Массив из списка: " + Arrays.toString(backToArray));

        // j) посчитать количество вхождений каждого числа
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : list) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }
        System.out.println("j) Частоты:");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println("   " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}