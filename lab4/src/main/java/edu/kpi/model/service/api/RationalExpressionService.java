package edu.kpi.model.service.api;

import edu.kpi.model.entity.Polynomial;
import edu.kpi.model.entity.RationalExpression;


public interface RationalExpressionService {
    RationalExpression divide(RationalExpression rationalExpression, double number);
    RationalExpression multiply(RationalExpression rationalExpression, double number);

    static RationalExpression createRationalExpression(Polynomial numerator, Polynomial denominator) {
        return new RationalExpression(numerator, denominator);
    }
}
