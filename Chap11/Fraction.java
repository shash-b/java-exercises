/*
 * Ch 11
 */

import java.util.Scanner; // for later use

public class Fraction {

    // the attributes/fields for the fraction
    private int num;
    private int den;

    // constructor that creates a fraction
    /* Fraction() {
        num = 0;
        den = 1;
    } */

    // overloaded constructor
   /* public Fraction() {
        num = 0;
        den = 1;
    } */

    public String toString() {
        return num + "/" + den;
    }

    public void enter() {
        String strFraction = IBIO.input("Enter fraction (a/b format): ");
        strFraction = strFraction.replace("/", " "); // changes slash to space
        Scanner parse = new Scanner(strFraction); // to parse fraction

        // extract numerator and denominator
        num = parse.nextInt();
        den = parse.nextInt();

    }

    public Fraction add(Fraction frac) {
        Fraction result = new Fraction();
        result.num = (this.num * frac.den) + (this.den * frac.num);
        result.den = this.den * frac.den;
        return result;
    }
}
