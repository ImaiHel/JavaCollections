package lab3;

import lab3.task1.CollectionsDemo;
import lab3.task2.PrimesGeneratorTest;
import lab3.task3.HumanDemo;
import lab3.task4.WordCounter;
import lab3.task5.MapUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== Задание 1 ==========");
        CollectionsDemo.run(15);

        System.out.println("\n========== Задание 2 ==========");
        PrimesGeneratorTest.run(10);

        System.out.println("\n========== Задание 3 ==========");
        HumanDemo.run();

        System.out.println("\n========== Задание 4 ==========");
        WordCounter.run("Java is great. Java is powerful! Great language, java java.");

        System.out.println("\n========== Задание 5 ==========");
        Map<String, Integer> original = new HashMap<>();
        original.put("один", 1);
        original.put("два", 2);
        original.put("три", 3);
        System.out.println("Исходная Map: " + original);
        Map<Integer, String> inverted = MapUtils.invert(original);
        System.out.println("Инвертированная Map: " + inverted);
    }
}