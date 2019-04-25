package SoftServe.CodeWars.Leetspeak;

import java.util.HashMap;
import java.util.Map;

public class Leetspeak extends Encoder{
    private static final Map<Character,String> dictionary = new HashMap<>();
    static{
        dictionary.put('a',"4");
        dictionary.put('e',"3");
        dictionary.put('l',"1");
        dictionary.put('m',"/^^\\");
        dictionary.put('o',"0");
        dictionary.put('u',"(_)");
    }

    @Override
    public String encode(String source) {
        if(source == null)
            return new String();

        StringBuilder result = new StringBuilder();
        for (char character : source.toCharArray()) {
            String encodedSymbol = dictionary.get(Character.toLowerCase(character));
            if(encodedSymbol != null){
                result.append(encodedSymbol);
            }else{
                result.append(character);
            }
        }
        return result.toString();
    }

}
abstract class Encoder{
    public abstract String encode(String source);
}

