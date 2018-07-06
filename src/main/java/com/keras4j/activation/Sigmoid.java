package com.keras4j.activation;

import org.ojalgo.matrix.BasicMatrix;
import org.ojalgo.matrix.PrimitiveMatrix;

public class Sigmoid implements Activation {
    @Override
    public PrimitiveMatrix activate(PrimitiveMatrix input) {
        double slope = 0.2;
        double shift = 0.5;
        input = input.multiply(slope).add(shift);
        BasicMatrix.Builder<PrimitiveMatrix> clippedX = PrimitiveMatrix.FACTORY.makeZero(input.countRows(), input.countColumns()).copy();

        for (int i = 0; i < input.count(); i++) {
            if (input.get(i) > 1) {
                clippedX.set(i, 1);
            } else if (input.get(i) < 0) {
                clippedX.set(i, 0);
            } else {
                clippedX.set(i, input.get(i));
            }
        }
        return clippedX.build();
    }
}
