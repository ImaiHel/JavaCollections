package lab3.task2;

import java.util.ArrayList;
import java.util.List;

public class PrimesGeneratorTest {

    public static void run(int n) {
        PrimesGenerator generator = new PrimesGenerator(n);

        // Прямой порядок
        List<Integer> primes = new ArrayList<>();
        System.out.println("Простые числа в прямом порядке:");
        for (int prime : generator) {
            primes.add(prime);
            System.out.print(prime + " ");
        }
        System.out.println();

        // Обратный порядок
        System.out.println("Простые числа в обратном порядке:");
        for (int i = primes.size() - 1; i >= 0; i--) {
            System.out.print(primes.get(i) + " ");
        }
        System.out.println();
    }
}