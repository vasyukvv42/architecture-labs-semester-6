package edu.kpi.controller.proxy;

import edu.kpi.model.entity.Polynomial;
import edu.kpi.model.entity.RationalExpression;
import edu.kpi.model.service.api.RationalExpressionService;

public class ProxyRationalExpressionService implements RationalExpressionService {
    private RationalExpressionService rationalExpressionService;

    @Override
    public RationalExpression divide(RationalExpression rationalExpression, double number) {
        System.out.printf("divide(\n\trationalExpression=%s,\n\tnumber=%s\n)", rationalExpression, number);
        System.out.println();
        return rationalExpressionService.divide(rationalExpression, number);
    }

    @Override
    public RationalExpression multiply(RationalExpression rationalExpression, double number) {
        System.out.printf("multiply(\n\trationalExpression=\n%s,\n\tnumber=%s\n)", rationalExpression, number);
        System.out.println();
        return rationalExpressionService.multiply(rationalExpression, number);
    }
}
