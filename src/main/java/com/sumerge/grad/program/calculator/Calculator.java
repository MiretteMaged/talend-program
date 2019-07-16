package com.sumerge.grad.program.calculator;

import com.sumerge.grad.program.operation.*;

public class Calculator {

    private ArithmeticOperation operation;

    public Double add(Double n1, Double n2) {
        operation = new Add();
        return operation.performOperation(n1,n2);
        //throw new NotImplementedException();
    }

    public Double subtract(Double n1, Double n2) {

        operation = new Subtract();
        return operation.performOperation(n1,n2);
        //throw new NotImplementedException();
    }

    public Double multiply(Double n1, Double n2) {
        //throw new NotImplementedException();
        operation = new Multiply();
        return operation.performOperation(n1,n2);
    }

    public Double divide(Double n1, Double n2) {
        operation = new Divide();
        return operation.performOperation(n1,n2);
        // throw new NotImplementedException();
    }
}
