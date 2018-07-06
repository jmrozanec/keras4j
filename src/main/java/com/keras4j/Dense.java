package com.keras4j;

import org.ojalgo.array.blas.DOT;
import org.ojalgo.matrix.PrimitiveMatrix;

public class Dense implements Layer {
    private PrimitiveMatrix kernel;
    private PrimitiveMatrix bias;

    public Dense(PrimitiveMatrix kernel, PrimitiveMatrix bias) {
        this.kernel = kernel;
        this.bias = bias;
    }

    public PrimitiveMatrix compute(PrimitiveMatrix input) {
        return bias.add(input.dot(kernel));
    }
}
