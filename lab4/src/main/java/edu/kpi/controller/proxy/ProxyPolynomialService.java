package edu.kpi.controller.proxy;

import edu.kpi.model.entity.Polynomial;
import edu.kpi.model.service.api.PolynomialService;
import edu.kpi.model.service.real.RealPolynomialService;

public class ProxyPolynomialService implements PolynomialService {
    private PolynomialService polynomialService = new RealPolynomialService();

    @Override
    public Polynomial divide(Polynomial polynomial, double number) {
        System.out.printf("divide(\n\tpolynomial=%s,\n\tnumber=%s\n)", polynomial, number);
        System.out.println();
        return polynomialService.divide(polynomial, number);
    }

    @Override
    public Polynomial multiply(Polynomial polynomial, double number) {
        System.out.printf("multiply(\n\tpolynomial=%s,\n\tnumber=%s\n)", polynomial, number);
        System.out.println();
        return polynomialService.multiply(polynomial, number);
    }
}
