package edu.kpi.model.service.real;

import edu.kpi.model.builder.RationalExpressionBuilder;
import edu.kpi.model.entity.Polynomial;
import edu.kpi.model.entity.RationalExpression;
import edu.kpi.model.service.api.RationalExpressionService;

public class RealRationalExpressionService implements RationalExpressionService {

    @Override
    public RationalExpression divide(RationalExpression rationalExpression, double number) {
        var polynomialService = new RealPolynomialService();
        var denominator = rationalExpression.getDenominator();
        var multiplied = polynomialService.multiply(denominator, number);

        return new RationalExpressionBuilder().setNumerator(rationalExpression.getNumerator()).setDenominator(multiplied).createRationalExpression();
    }

    @Override
    public RationalExpression multiply(RationalExpression rationalExpression, double number) {
        var polynomialService = new RealPolynomialService();
        var numerator = rationalExpression.getNumerator();
        var multiplied = polynomialService.multiply(numerator, number);

        return new RationalExpressionBuilder().setNumerator(multiplied).setDenominator(rationalExpression.getDenominator()).createRationalExpression();
    }
}
