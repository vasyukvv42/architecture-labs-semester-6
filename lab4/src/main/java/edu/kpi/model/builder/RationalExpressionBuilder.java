package edu.kpi.model.builder;

import edu.kpi.model.entity.Polynomial;
import edu.kpi.model.entity.RationalExpression;
import edu.kpi.model.service.api.RationalExpressionService;

public class RationalExpressionBuilder {
    private Polynomial numerator;
    private Polynomial denominator;

    public RationalExpressionBuilder setNumerator(Polynomial numerator) {
        this.numerator = numerator;
        return this;
    }

    public RationalExpressionBuilder setDenominator(Polynomial denominator) {
        this.denominator = denominator;
        return this;
    }

    public RationalExpression createRationalExpression() {
        return RationalExpressionService.createRationalExpression(numerator, denominator);
    }
}