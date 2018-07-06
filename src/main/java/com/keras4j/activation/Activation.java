package com.keras4j.activation;

import org.ojalgo.matrix.PrimitiveMatrix;

public interface Activation {
    PrimitiveMatrix activate(PrimitiveMatrix input);
}
