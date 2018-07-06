package com.keras4j.activation;

import org.ojalgo.matrix.BasicMatrix;
import org.ojalgo.matrix.PrimitiveMatrix;

public class ReLU implements Activation {
    @Override
    public PrimitiveMatrix activate(PrimitiveMatrix input) {
        BasicMatrix.Builder<PrimitiveMatrix> activated = PrimitiveMatrix.FACTORY.makeZero(input.countRows(), input.countColumns()).copy();
        for (int i = 0; i < input.count(); i++) {
            activated.set(i, Math.max(0, input.get(i)));
        }
        return activated.build();
    }
}
