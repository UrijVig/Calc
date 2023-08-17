package Presenter;

import Model.DataExpression;
import Model.UserCalculator;

public class UserPresenter {
    private final DataExpression expression;

    public UserPresenter() {
        expression = new DataExpression();
    }

    public void calk() {
        Calculator calc = new UserCalculator(expression);
        switch (expression.getAction()) {
            case "+" -> calc.addition();
            case "-" -> calc.subtraction();
            case "*" -> calc.multiplication();
            case "/" -> calc.division();
        }

    }

    public void newOneNumber(double v) {
        expression.setOneNumber(v);
    }

    public void newTwoNumber(double v) {
        expression.setTwoNumber(v);
    }

    public void newAction(String string) {
        expression.setAction(string);
    }

    public DataExpression getExpression() {
        return expression;
    }
}
