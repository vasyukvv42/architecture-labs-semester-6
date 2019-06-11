package edu.kpi.model.entity;

import edu.kpi.model.builder.PolynomialBuilder;

public class RationalExpression extends Polynomial {
    private Polynomial denominator;

    public RationalExpression(Polynomial numerator, Polynomial denominator) {
        super(numerator.symbol, numerator.coefficients);
        this.denominator = denominator;
    }

    public Polynomial getNumerator() {
        return new PolynomialBuilder().setSymbol(symbol).setCoefficients(coefficients).createPolynomial();
    }

    public void setNumerator(Polynomial numerator) {
        this.coefficients = numerator.coefficients;
        this.symbol = numerator.symbol;
    }

    public Polynomial getDenominator() {
        return denominator;
    }

    public void setDenominator(Polynomial denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        final var sb = new StringBuilder(super.toString());
        sb.append('\n');

        var denominatorStr = denominator.toString();
        sb.append("–".repeat(denominatorStr.length()));
        sb.append('\n');

        sb.append(denominatorStr);

        return sb.toString();
    }
}
