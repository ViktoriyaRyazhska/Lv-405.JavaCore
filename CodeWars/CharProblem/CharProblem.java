package SoftServe.CodeWars.CharProblem;

public class CharProblem {

    
    public static int howOld(final String herOld) {
        for (char c : herOld.toCharArray()) {
            if(Character.isDigit(c)){
                return Character.getNumericValue(c);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("howOld() = " + howOld(" I am 10"));
        System.out.println("howOld() = " + howOld(" Mb I5"));
        System.out.println("howOld() = " + howOld("I have7yeeeear"));
        System.out.println("howOld() = " + howOld("bla7bla"));


    }
}
