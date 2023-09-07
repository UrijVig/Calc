package Model;

import Model.Exception.DivisionByZeroException;

public class UserCalculator implements Сalculator {

    DataExpression ex;

    public UserCalculator(DataExpression ex) {
        this.ex = ex;
    }

    @Override
    public void addition() {
        ex.setResult(ex.getOneNumber() + ex.getTwoNumber());
    }

    @Override
    public void subtraction() {
        ex.setResult(ex.getOneNumber() - ex.getTwoNumber());
    }

    @Override
    public void multiplication() {
        ex.setResult(ex.getOneNumber() * ex.getTwoNumber());
    }

    @Override
    public void division() throws DivisionByZeroException {
        if(ex.getTwoNumber()!=0){
            ex.setResult(ex.getOneNumber() / ex.getTwoNumber());
        } else throw new DivisionByZeroException("Деление на ноль не предусмотренно возможностями данной программы!");

    }
}
