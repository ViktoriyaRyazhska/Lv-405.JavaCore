package SoftServe.CodeWars.MostFrequentlyWord;

import java.util.*;

public class TopWords {

    public static List<String> top3(String s) {

        String[] words = s.toLowerCase().replaceAll("[^'a-zA-Z0-9]", " ").split("\\s+");
        Map<String,Integer> topWords = new TreeMap<>();

        Integer count;

        for (String word : words) {
           count = topWords.get(word);
           if(count == null){
               topWords.put(word, 1);
           }
           else {
               topWords.put(word, ++count);
           }
        }
        Map<String,Integer> result = new LinkedHashMap<>();

            topWords.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .filter(x -> !x.getKey().equals("") && !x.getKey().startsWith("'"))
                    .limit(3)
                    .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

            List<String> keyList = new ArrayList<>(result.keySet());

            return keyList;

    }
    
}
