package edu.kpi.model;

public interface RationalExpression {
    Polynomial getNumerator();
    void setNumerator(Polynomial numerator);

    Polynomial getDenominator();
    void setDenominator(Polynomial denominator);

}
