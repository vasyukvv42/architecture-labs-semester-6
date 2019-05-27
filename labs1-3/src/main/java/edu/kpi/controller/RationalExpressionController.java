package edu.kpi.controller;

import edu.kpi.model.Polynomial;
import edu.kpi.model.ProxyRationalExpression;
import edu.kpi.model.RationalExpression;
import edu.kpi.view.RationalExpressionView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class RationalExpressionController {
    private RationalExpressionView view;
    private RationalExpression model;
    private Scanner scanner;

    public RationalExpressionController(RationalExpressionView view, InputStream in) {
        this.view = view;
        this.scanner = new Scanner(in);
    }

    public void readUserInput() {
        final var numerator = readPolynomial();
        final var denominator = readPolynomial();

        model = new ProxyRationalExpression(numerator, denominator);

        view.showRationalExpression(model);
    }

    private Polynomial readPolynomial() {
        view.showSymbolPrompt();
        final var symbol = scanner.next().charAt(0);

        view.showDegreePrompt();
        final var degree = scanner.nextInt();

        final var coefficients = new ArrayList<Double>();

        for (int i = 0; i <= degree; i++) {
            view.showCoefficientPrompt(degree - i, symbol);
            coefficients.add(scanner.nextDouble());
        }

        return new Polynomial(symbol, coefficients);
    }

    public RationalExpression getModel() {
        return model;
    }
}
