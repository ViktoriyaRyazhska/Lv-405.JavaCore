package SoftServe.CodeWars.PrimeGap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeGap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(10,300,400)));

    }

    public static long[] gap(int g, long m , long n){

        // traverse through Sieve of Eratosthenes
        boolean[] isPrime = new boolean[(int)n + 1];
        List<Integer> primeNumber = new ArrayList<>();

        Arrays.fill(isPrime, true);
        isPrime[1] = false;

        // determine primes <= n
        for (int factor = 2; factor*factor < isPrime.length; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor*j < isPrime.length; j++)
                    isPrime[factor*j] = false;
            }
        }

        // pass all prime numbers to ArrayList
        for(int index = (int)m; index < isPrime.length; index++){
            if(isPrime[index]){
                primeNumber.add(index);
            }
        }

        // find first pair of prime numbers with gap = g
        Integer[] primeArr = new Integer[primeNumber.size()];
        primeArr = primeNumber.toArray(primeArr);

        long[] result = new long[2];
        int gap = 0;
        for(int index = 0; index < primeArr.length; index++){
            try {
                gap = primeArr[index + 1] - primeArr[index];
            }catch (IndexOutOfBoundsException e){
                return null;
            }
            if(gap == g){
                result[0] = primeArr[index];
                result[1] = primeArr[index+1];
                return result;
            }
        }

        return null;
    }
}
