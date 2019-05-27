package edu.kpi.model;

import edu.kpi.model.Polynomial;
import edu.kpi.model.RealRationalExpression;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RealRationalExpressionTest {

    @ParameterizedTest
    @MethodSource("valuesForToString")
    void toString_(RealRationalExpression expression, String str) {
        assertEquals(expression.toString(), str);
    }

    static Stream<Arguments> valuesForToString() {
        return Stream.of(
                Arguments.of(
                        new RealRationalExpression(
                                new Polynomial('y', Arrays.asList(1.0, 10.0, -1.5, 0.0, 2.0)),
                                new Polynomial('y', Arrays.asList(1.0, 10.0, -1.5, 0.0, 2.0))),
                        "(+ y^4 + 10.0y^3 - 1.5y^2 + 2.0)\n" +
                        "––––––––––––––––––––––––––––––––\n" +
                        "(+ y^4 + 10.0y^3 - 1.5y^2 + 2.0)"),
                Arguments.of(
                        new RealRationalExpression(
                                new Polynomial(Arrays.asList(228.0, 1337.0)),
                                new Polynomial(Arrays.asList(228.0, 1337.0))),
                        "(+ 228.0x + 1337.0)\n" +
                        "–––––––––––––––––––\n" +
                        "(+ 228.0x + 1337.0)"),
                Arguments.of(
                        new RealRationalExpression(
                                new Polynomial(Arrays.asList(228.0, 1337.0)),
                                new Polynomial('z', Arrays.asList(42.0, 1.0, - 1.0, 1.0, 0.0, -1.0))),
                        "(+ 228.0x + 1337.0)\n" +
                        "––––––––––––––––––––––––––––––––––––––\n" +
                        "(+ 42.0z^5 + z^4 - 1.0z^3 + z^2 - 1.0)"),
                Arguments.of(
                        new RealRationalExpression(
                                new Polynomial('x', Collections.emptyList()),
                                new Polynomial('x', Collections.emptyList())),
                        "()\n––\n()")
        );
    }
}