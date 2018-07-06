package com.keras4j.activation;

import org.ojalgo.matrix.BasicMatrix;
import org.ojalgo.matrix.PrimitiveMatrix;

public class Softmax implements Activation {

    @Override
    public PrimitiveMatrix activate(PrimitiveMatrix input) {
        input = input.transpose();
        BasicMatrix.Builder<PrimitiveMatrix> activated = PrimitiveMatrix.FACTORY.makeZero(input.countRows(), input.countColumns()).copy();
        for (int r = 0; r < input.countRows(); r++) {
            double rowsum = 0;
            double [] row = new double[(int)input.countColumns()];
            for (int c = 0; c < input.countColumns(); c++) {
                double transformed = Math.exp(input.get(r, c));
                rowsum += transformed;
                row[c] = transformed;
            }
            for (int c = 0; c < input.countColumns(); c++) {
                activated.set(r, c, row[c]/rowsum);
            }
        }
        return activated.build();
    }
}



