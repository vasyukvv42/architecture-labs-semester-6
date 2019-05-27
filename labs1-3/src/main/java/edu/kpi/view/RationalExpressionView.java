package edu.kpi.view;

import edu.kpi.model.RationalExpression;

import java.io.PrintStream;

public class RationalExpressionView {
    private PrintStream out;

    public RationalExpressionView(PrintStream out) {
        this.out = out;
    }

    public void showSymbolPrompt() {
        out.println("Enter polyonmial symbol:");
    }


    public void showDegreePrompt() {
        out.println("Enter polynomial degree (highest power):");
    }

    public void showCoefficientPrompt(int degree, char symbol) {
        out.printf("Enter coefficient for %c^%d:", symbol, degree);
        out.println();
    }

    public void showRationalExpression(RationalExpression expression) {
        out.println(expression);
    }
}
