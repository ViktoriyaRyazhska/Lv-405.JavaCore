package SoftServe.StringRegularExpression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try {

            System.out.println("Enter words from console: ");
            String[] words =  inputWordsFromConsole(br);

            String longestWord = getLongestWord(words);
            System.out.printf("%s is longest word and it has %d letters %n",longestWord,longestWord.length());

            System.out.println("Witch word you want to reverse, enter position:");
            makeSomeWordReverse(words,Integer.parseInt(br.readLine()));
            System.out.println("After reverse: " +  Arrays.toString(words));

            System.out.println("Enter some sentence with extra spaces: ");
            String sentenceWithoutExtraSpaces = trimExtraSpaces(br.readLine());
            System.out.println(sentenceWithoutExtraSpaces);


            System.out.println("Enter text where we'll be finding $$$$$");
            String text = br.readLine();
            String[] usCurrency = getAllUSCurrencyFromText(text);
            System.out.println(Arrays.toString(usCurrency));

        } catch (IOException e ) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static String[] inputWordsFromConsole(BufferedReader reader) throws IOException, IllegalArgumentException {
        if(reader == null){
            throw new IllegalArgumentException("BufferedReader cannot be null");
        }

        StringBuilder words = new StringBuilder();
        String data;
        while (!(data = br.readLine()).equals("")) {
            words.append(data.trim()).append(" ");
        }

        return words.toString().split(" ");
    }

    private static String getLongestWord(String[] words) throws IllegalArgumentException{
        if(words == null){
            throw new IllegalArgumentException("String[] cannot be null");
        }
        if(words.length == 0){
            throw new IllegalArgumentException("String[] cannot be empty");
        }

        String longestWord = words[0];
        for (String word : words) {
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        return longestWord;
    }

    // this method change our string array since array is object
    // and method use reference to our original array
    // if we don't want that behavior we can simply make new array and do all change in it and return him
    private static void makeSomeWordReverse(String[] words, int wordsPosition)throws IllegalArgumentException{
        if(words == null){
            throw new IllegalArgumentException("String[] cannot be null");
        }
        if(words.length == 0 | words.length < wordsPosition){
            throw new IllegalArgumentException("String[] cannot be empty and" +
                    " word position can be less then or equal to array size");
        }

         words[wordsPosition-1] = new StringBuilder(words[wordsPosition - 1]).reverse().toString();

    }

    private static String trimExtraSpaces(String sentence)throws IllegalArgumentException{
        if(sentence == null){
            throw new IllegalArgumentException("String cannot be null");
        }

        return sentence.replaceAll("[ ]{2,}"," ");
    }

    /**
     *
     * @param text from user
     *
     * @return  String array with all occur that match "\$\d*\.\d{2}" pattern
     *          or empty array
     * @throws IllegalArgumentException if argument is null
     */
    private static String[] getAllUSCurrencyFromText(String text)throws IllegalArgumentException{
        if(text == null){
            throw new IllegalArgumentException("String cannot be null");
        }

        Pattern pattern = Pattern.compile("(\\$\\d*(\\.\\d{2}))+?");
        Matcher matcher = pattern.matcher(text);
        StringBuilder usCurrency = new StringBuilder();
        while (matcher.find()){
            usCurrency.append(matcher.group()).append(" ");
        }

        return usCurrency.toString().split(" ");
    }
}
