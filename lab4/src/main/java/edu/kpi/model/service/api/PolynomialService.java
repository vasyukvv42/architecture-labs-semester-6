package edu.kpi.model.service.api;

import edu.kpi.model.entity.Polynomial;

import java.util.Collection;

public interface PolynomialService {
    Polynomial divide(Polynomial polynomial, double number);
    Polynomial multiply(Polynomial polynomial, double number);

    static Polynomial createPolynomial(char symbol, Collection<Double> coefficients) {
        return new Polynomial(symbol, coefficients);
    }
}
