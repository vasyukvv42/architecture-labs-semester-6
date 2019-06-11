package edu.kpi.model.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Polynomial {
    List<Double> coefficients;
    char symbol;

    public Polynomial(char symbol, Collection<Double> coefficients) {
        if (coefficients == null)
            throw new NullPointerException();
        this.symbol = symbol;
        this.coefficients = new ArrayList<>(coefficients);
    }

    public Polynomial(Collection<Double> coefficients) {
        this('x', coefficients);
    }

    public List<Double> getCoefficients() {
        return coefficients;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setCoefficients(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        var lambdaContext = new Object() {
            int power = coefficients.size() - 1;
        };

        return coefficients.stream()
                .map(c -> {
                    int currentPower = lambdaContext.power--;

                    final var sb = new StringBuilder();

                    if (c == 0) {
                        return "";
                    } else {
                        sb.append(c > 0 ? '+' : '-');
                        sb.append(' ');
                    }

                    if (c != 1 || currentPower == 0)
                        sb.append(Math.abs(c));

                    if (currentPower != 0)
                        sb.append(symbol);

                    if (currentPower > 1) {
                        sb.append('^');
                        sb.append(currentPower);
                    }

                    return sb.toString();
                })
                .filter(str -> !str.isEmpty())
                .collect(Collectors.joining(" ", "(", ")"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return symbol == that.symbol &&
                coefficients.equals(that.coefficients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coefficients, symbol);
    }
}
