package com.keras4j;

import org.ojalgo.matrix.BasicMatrix;
import org.ojalgo.matrix.PrimitiveMatrix;

public class Flatten implements Layer {
    @Override
    public PrimitiveMatrix compute(PrimitiveMatrix input) {
        long rows = input.countRows();
        long columns = input.countColumns();
        BasicMatrix.Builder<PrimitiveMatrix> flattened = PrimitiveMatrix.FACTORY.makeZero(1, rows*columns).copy();

        for(int r = 0; r<rows; r++){
            for(int c = 0; c<columns; c++){
                flattened.set(0, (r+1)*c, input.get(r, c));
            }
        }
        return flattened.build();
    }
}
