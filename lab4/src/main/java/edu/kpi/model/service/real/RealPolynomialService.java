package edu.kpi.model.service.real;

import edu.kpi.model.builder.PolynomialBuilder;
import edu.kpi.model.entity.Polynomial;
import edu.kpi.model.service.api.PolynomialService;

import java.util.stream.Collectors;

public class RealPolynomialService implements PolynomialService {

    @Override
    public Polynomial divide(Polynomial polynomial, double number) {
        var coefficients = polynomial.getCoefficients().stream()
                .map((coefficient) -> coefficient / number)
                .collect(Collectors.toList());
        return new PolynomialBuilder().setSymbol(polynomial.getSymbol()).setCoefficients(coefficients).createPolynomial();
    }

    @Override
    public Polynomial multiply(Polynomial polynomial, double number) {
        var coefficients = polynomial.getCoefficients().stream()
                .map((coefficient) -> coefficient * number)
                .collect(Collectors.toList());
        return new PolynomialBuilder().setSymbol(polynomial.getSymbol()).setCoefficients(coefficients).createPolynomial();
    }
}
