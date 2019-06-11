package edu.kpi;

import edu.kpi.controller.RationalExpressionController;
import edu.kpi.view.RationalExpressionView;

public class Main {

    public static void main(String[] args) {
        // MVC
        final var view = RationalExpressionView.getInstance();
        final var controller = new RationalExpressionController(view, System.in);

        controller.readUserInput();
    }
}
