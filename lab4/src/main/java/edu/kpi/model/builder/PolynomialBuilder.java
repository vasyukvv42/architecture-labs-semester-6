package edu.kpi.model.builder;

import edu.kpi.model.entity.Polynomial;
import edu.kpi.model.service.api.PolynomialService;
import edu.kpi.model.service.real.RealPolynomialService;

import java.util.Collection;

public class PolynomialBuilder {
    private char symbol = 'x';
    private Collection<Double> coefficients;

    public PolynomialBuilder setSymbol(char symbol) {
        this.symbol = symbol;
        return this;
    }

    public PolynomialBuilder setCoefficients(Collection<Double> coefficients) {
        this.coefficients = coefficients;
        return this;
    }

    public Polynomial createPolynomial() {
        return PolynomialService.createPolynomial(symbol, coefficients);
    }
}