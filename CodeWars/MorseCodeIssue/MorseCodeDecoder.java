package SoftServe.CodeWars.MorseCodeIssue;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
    private static final Map<String, Character> morseAlphabet = new HashMap<>();

    static {

        morseAlphabet.put(".-", 'A');
        morseAlphabet.put("-...", 'B');
        morseAlphabet.put("-.-.", 'C');
        morseAlphabet.put("-..", 'D');
        morseAlphabet.put(".", 'E');
        morseAlphabet.put("..-.", 'F');
        morseAlphabet.put("--.", 'G');
        morseAlphabet.put("....", 'H');
        morseAlphabet.put("..", 'I');
        morseAlphabet.put(".---", 'J');
        morseAlphabet.put("-.-", 'K');
        morseAlphabet.put(".-..", 'L');
        morseAlphabet.put("--", 'M');
        morseAlphabet.put("-.", 'N');
        morseAlphabet.put("---", 'O');
        morseAlphabet.put(".--.", 'P');
        morseAlphabet.put("--.-", 'Q');
        morseAlphabet.put(".-.", 'R');
        morseAlphabet.put("...", 'S');
        morseAlphabet.put("-", 'T');
        morseAlphabet.put("..-", 'U');
        morseAlphabet.put("...-", 'V');
        morseAlphabet.put(".--", 'W');
        morseAlphabet.put("-..-", 'X');
        morseAlphabet.put("-.--", 'Y');
        morseAlphabet.put("--..", 'Z');
        morseAlphabet.put("-----", '0');
        morseAlphabet.put(".----", '1');
        morseAlphabet.put("..---", '2');
        morseAlphabet.put("...--", '3');
        morseAlphabet.put("....-", '4');
        morseAlphabet.put(".....", '5');
        morseAlphabet.put("-....", '6');
        morseAlphabet.put("--...", '7');
        morseAlphabet.put("---..", '8');
        morseAlphabet.put("----.", '9');

    }
    public static String decode(String morseCode) {
        if(morseCode == null){
            return new String();
        }

        StringBuilder result = new StringBuilder();
        String[] separateWordMorseCode = morseCode.trim().split("   ");
        for (String word : separateWordMorseCode) {
            String[] separatedCharacter = word.split(" ");
            for (String encodedChar : separatedCharacter) {
                result.append(morseAlphabet.get(encodedChar));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String decodedString = MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .");
        System.out.println(decodedString);
    }
}
