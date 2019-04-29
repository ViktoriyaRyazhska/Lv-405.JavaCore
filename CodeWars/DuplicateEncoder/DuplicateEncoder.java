package SoftServe.CodeWars.DuplicateEncoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

   protected static String encode(String phrase) {
        Map<Character, Integer> map = new HashMap<>();
        phrase = phrase.toLowerCase();

        for(int i = 0; i < phrase.length(); i++){

            if(map.containsKey(phrase.charAt(i))){

                int value = map.get(phrase.charAt(i));
                map.put(phrase.charAt(i), ++value);

            } else {
                map.put(phrase.charAt(i), 1);
            }
        }

        StringBuilder encodedString = new StringBuilder();

        for(int i = 0; i < phrase.length(); i++){
            encodedString.append((map.get(phrase.charAt(i)) > 1) ? ")" : "(");
        }

        return encodedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Su[ces]s"));
    }
}
