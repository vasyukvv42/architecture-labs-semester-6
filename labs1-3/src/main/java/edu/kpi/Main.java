package edu.kpi;

import edu.kpi.controller.RationalExpressionController;
import edu.kpi.model.Polynomial;
import edu.kpi.model.ProxyRationalExpression;
import edu.kpi.model.RationalExpression;
import edu.kpi.reflection.CallThis;
import edu.kpi.reflection.ReflectionUtil;
import edu.kpi.view.RationalExpressionView;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*
        final var poly = new Polynomial('y', Arrays.asList(1.0, 10.0, -1.5, 0.0, 2.0));

        // Reflection tasks
        final var reflection = new ReflectionUtil();
        try {
            reflection.invokeMethodsByAnnotation(poly, CallThis.class);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        reflection.printClassName(Polynomial.class, System.out);
        reflection.printAllFields(Polynomial.class, System.out);
        reflection.printAllAnnotations(Polynomial.class, System.out);
*/

        // MVC
        final var view = new RationalExpressionView(System.out);
        final var controller = new RationalExpressionController(view, System.in);

        controller.readUserInput();
    }
}
