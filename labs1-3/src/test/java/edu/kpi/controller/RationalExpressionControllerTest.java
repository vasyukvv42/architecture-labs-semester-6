package edu.kpi.controller;

import edu.kpi.view.RationalExpressionView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RationalExpressionControllerTest {

    private RationalExpressionView view;

    @BeforeEach
    void setUp() {
        view = mock(RationalExpressionView.class);
    }

    @Test
    void readUserInput() {
        var inputString = "x\n1\n1\n1\ny\n1\n1\n1\n";
        var in = new ByteArrayInputStream(inputString.getBytes());
        var controller = new RationalExpressionController(view, in);
        controller.readUserInput();

        verify(view, times(2)).showDegreePrompt();
        verify(view, times(2)).showSymbolPrompt();

        verify(view).showCoefficientPrompt(1, 'x');
        verify(view).showCoefficientPrompt(0, 'x');
        verify(view).showCoefficientPrompt(1, 'y');
        verify(view).showCoefficientPrompt(0, 'y');

        verify(view).showRationalExpression(controller.getModel());
    }
}