package Model;

public class DataExpression {
    private double oneNumber;
    private double twoNumber;
    private double result;
    private String action;

    public double getOneNumber() {
        return oneNumber;
    }

    public void setOneNumber(double oneNumber) {
        this.oneNumber = oneNumber;
    }

    public double getTwoNumber() {
        return twoNumber;
    }

    public void setTwoNumber(double twoNumber) {
        this.twoNumber = twoNumber;
    }

//    public double getResult() {
//        return result;
//    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return oneNumber + " " + action + " " + twoNumber + " = " + result;
    }
}
