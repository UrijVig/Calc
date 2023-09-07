package Model;

import Model.Exception.DivisionByZeroException;

public interface Сalculator {
    void addition();

    void subtraction();

    void multiplication();

    void division() throws DivisionByZeroException;
}
