package Model;

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
    public void division() {
        ex.setResult(ex.getOneNumber() / ex.getTwoNumber());
    }
}
