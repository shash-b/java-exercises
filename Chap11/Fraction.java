/*
 * Ch 11
 */

import java.util.Scanner; // for later use

public class Fraction {

    // the attributes/fields for the fraction
    private int num;
    private int den;

    // constructor that creates a fraction
    Fraction(int a, int b) {
        num = a;
        den = b;
    }

    public String toString() {
        return num + " / " + den;
    }
}
