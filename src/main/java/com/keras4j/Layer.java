package com.keras4j;

import org.ojalgo.matrix.PrimitiveMatrix;

public interface Layer {
    PrimitiveMatrix compute(PrimitiveMatrix input);
}
