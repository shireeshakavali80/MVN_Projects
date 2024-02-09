package practice;
import java.util.*;

public class SortHashMap {

    public static Map<String, Integer> sortHashMap(Map<String, Integer> unsortedMap, Comparator<Map.Entry<String, Integer>> comparator) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedMap.entrySet());
        list.sort(comparator);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 30);
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 35);
        hashMap.put("Diana", 28);

        // Sort the HashMap by keys
        Map<String, Integer> sortedByKey = sortHashMap(hashMap, Map.Entry.comparingByKey());

        // Print the sorted map
        System.out.println("Sorting by keys:");
        printMap(sortedByKey);

        // Sort the HashMap by values
        Map<String, Integer> sortedByValue = sortHashMap(hashMap, Map.Entry.comparingByValue());

        // Print the sorted map
        System.out.println("\nSorting by values:");
        printMap(sortedByValue);
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
