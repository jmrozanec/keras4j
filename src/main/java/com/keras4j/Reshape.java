package com.keras4j;

import org.ojalgo.matrix.BasicMatrix;
import org.ojalgo.matrix.PrimitiveMatrix;

public class Reshape implements Layer {
    private int row;
    private int column;

    private Reshape(){}

    public Reshape(int row, int column){
        this.row = row;
        this.column = column;
    }

    @Override
    public PrimitiveMatrix compute(PrimitiveMatrix input) {
        long rows = input.countRows();
        long columns = input.countColumns();
        BasicMatrix.Builder<PrimitiveMatrix> reshaped = PrimitiveMatrix.FACTORY.makeZero(row, column).copy();

        int newrowcount=0;
        int newcolcount=0;
        for(int r = 0; r<rows; r++){
            for(int c = 0; c<columns; c++){
                if(newcolcount>=column) {
                    newrowcount++;
                    newcolcount = 0;
                }
                reshaped.set(newrowcount, newcolcount, input.get(r, c));
                newcolcount++;
            }
        }
        return reshaped.build();
    }
}
