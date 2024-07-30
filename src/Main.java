import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Task 1

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println("num = " + num);
            }
        }

//        Task 2

        Set<Integer> uniqueEvenNumbers = new TreeSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }

        System.out.println("Unique even numbers in ascending order:");
        for (int num : uniqueEvenNumbers) {
            System.out.println(num);
        }
// Task 3
        List<String> words = new ArrayList<>(List.of(
                "apple", "banana", "apple", "cherry", "banana", "date", "cherry", "fig", "grape", "date"
        ));

        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println("Unique words in the list:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }


//    Task 4
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Count of duplicates for each unique word:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}