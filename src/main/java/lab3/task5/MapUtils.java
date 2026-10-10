package lab3.task5;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {

    public static <K, V> Map<V, K> invert(Map<K, V> source) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<K, V> entry : source.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }
}