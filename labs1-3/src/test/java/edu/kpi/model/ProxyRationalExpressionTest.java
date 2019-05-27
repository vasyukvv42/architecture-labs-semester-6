package edu.kpi.model;

import edu.kpi.model.Polynomial;
import edu.kpi.model.ProxyRationalExpression;
import edu.kpi.model.RationalExpression;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ProxyRationalExpressionTest {
    private RationalExpression rationalExpression;
    private Polynomial polynomial = new Polynomial('x', Collections.emptyList());

    @BeforeEach
    void setUp() {
        rationalExpression = new ProxyRationalExpression(polynomial, polynomial);
    }

    @Test
    void setNumeratorThrowsRuntimeException() {
        assertThrows(RuntimeException.class, () -> rationalExpression.setNumerator(polynomial));
    }

    @Test
    void setDenominatorThrowsRuntimeException() {
        assertThrows(RuntimeException.class, () -> rationalExpression.setDenominator(polynomial));
    }
}