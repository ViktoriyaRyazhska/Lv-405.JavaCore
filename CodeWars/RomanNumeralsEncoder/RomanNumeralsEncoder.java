package SoftServe.CodeWars.RomanNumeralsEncoder;

public class RomanNumeralsEncoder {
    public static void main(String[] args) {
        System.out.println(solution(51));
        System.out.println(solution(22));
        System.out.println(solution(115));
        System.out.println(solution(25));
        System.out.println(solution(33));
    }
    public static String solution(int n) {

        String[] romanNumerals = {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] decimalDigit = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder finalRomanNum = new StringBuilder();

        for (int i = 0; i < decimalDigit.length; i ++) {
            int currentNum =  n / decimalDigit[i];
            if(currentNum == 0){
                continue;
            }

            for (int j = 0; j < currentNum; j++) {
                finalRomanNum.append(romanNumerals[i]);
            }

            n = n%decimalDigit[i];
        }
        return finalRomanNum.toString();
    }
}
