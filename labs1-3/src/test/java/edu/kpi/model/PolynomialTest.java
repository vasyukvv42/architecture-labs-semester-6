package edu.kpi.model;

import edu.kpi.model.Polynomial;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest {

    @ParameterizedTest
    @MethodSource("valuesForToString")
    void toString_(Polynomial poly, String str) {
        assertEquals(poly.toString(), str);
    }

    static Stream<Arguments> valuesForToString() {
        return Stream.of(
                Arguments.of(
                        new Polynomial('y', Arrays.asList(1.0, 10.0, -1.5, 0.0, 2.0)),
                        "(+ y^4 + 10.0y^3 - 1.5y^2 + 2.0)"),
                Arguments.of(
                        new Polynomial(Arrays.asList(228.0, 1337.0)),
                        "(+ 228.0x + 1337.0)"),
                Arguments.of(
                        new Polynomial('z', Arrays.asList(42.0, 1.0, - 1.0, 1.0, 0.0, -1.0)),
                        "(+ 42.0z^5 + z^4 - 1.0z^3 + z^2 - 1.0)"),
                Arguments.of(
                        new Polynomial('x', Collections.emptyList()),
                        "()")
        );
    }
}