package SoftServe.CodeWars.FractionsClassTask;

public class Fraction implements Comparable<Fraction>
{
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!

    //Add two fractions
    public Fraction add(Fraction f2) {

        long resultTop = (this.top * f2.bottom) + (this.bottom * f2.top);
        long resultBottom = this.bottom * f2.bottom;
        long gcdOfTopAndBottom = greatestCommonDivisor(resultTop, resultBottom);

        return new Fraction(resultTop/gcdOfTopAndBottom,
                resultBottom/ gcdOfTopAndBottom);


    }

    private static long greatestCommonDivisor(long a, long b) {
        if (b == 0) return a;
        return greatestCommonDivisor(b,a % b);
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}