package edu.kpi.view;

import edu.kpi.model.entity.RationalExpression;

import java.io.PrintStream;

public class RationalExpressionView {
    private static RationalExpressionView ourInstance = new RationalExpressionView();

    public static RationalExpressionView getInstance() {
        return ourInstance;
    }

    private RationalExpressionView() {
    }

    private PrintStream out = System.out;

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

    public PrintStream getOut() {
        return out;
    }

    public void setOut(PrintStream out) {
        this.out = out;
    }

    public void showRationalExpression(RationalExpression expression) {
        out.println(expression);
    }
}
