package SoftServe.CodeWars.MostFrequentlyWord;

import java.util.*;

public class TopWords {

    public static List<String> top3(String s) {

        String[] words = s.toLowerCase().replaceAll("[^'a-zA-Z_0-9]", " ").split("\\s+");
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

            if(keyList.size() == 3) {
                Integer amountOne = result.get(keyList.get(0));
                Integer amountTwo = result.get(keyList.get(1));
                Integer amountThree = result.get(keyList.get(2));

                if (amountOne.equals(amountThree) && amountTwo.equals(amountThree)) {
                    keyList.sort(String::compareTo);
                    Collections.reverse(keyList);
                    return keyList;
                }

                if (amountOne.equals(amountTwo)) {
                    String[] arrKey = new String[keyList.size()];
                    keyList.toArray(arrKey);

                    Arrays.sort(arrKey, 0, 2, Collections.reverseOrder());

                    return Arrays.asList(arrKey);
                }
            }

            return keyList;

    }

    public static void main(String[] args) {

    }
}
