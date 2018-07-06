package com.keras4j;

import com.keras4j.activation.Activations;
import com.keras4j.activation.ReLU;
import org.ojalgo.matrix.BasicMatrix;
import org.ojalgo.matrix.PrimitiveMatrix;

import java.util.ArrayList;

//Take into account the following references
//https://github.com/optimatika/ojAlgo/wiki/Getting-Started
//https://github.com/Rachnog/Keras2Java-LSTM/
public class LSTM implements Layer {
    private PrimitiveMatrix W_i;
    private PrimitiveMatrix U_i;
    private PrimitiveMatrix b_i;
    private PrimitiveMatrix W_c;
    private PrimitiveMatrix U_c;
    private PrimitiveMatrix b_c;
    private PrimitiveMatrix W_f;
    private PrimitiveMatrix U_f;
    private PrimitiveMatrix b_f;
    private PrimitiveMatrix W_o;
    private PrimitiveMatrix U_o;
    private PrimitiveMatrix b_o;

    private int realSize;
    private int layerNum;
    private boolean returnSequence;

    public LSTM(PrimitiveMatrix w_i, PrimitiveMatrix u_i, PrimitiveMatrix b_i, PrimitiveMatrix w_c, PrimitiveMatrix u_c, PrimitiveMatrix b_c, PrimitiveMatrix w_f, PrimitiveMatrix u_f, PrimitiveMatrix b_f, PrimitiveMatrix w_o, PrimitiveMatrix u_o, PrimitiveMatrix b_o) {
        W_i = w_i;
        U_i = u_i;
        this.b_i = b_i;
        W_c = w_c;
        U_c = u_c;
        this.b_c = b_c;
        W_f = w_f;
        U_f = u_f;
        this.b_f = b_f;
        W_o = w_o;
        U_o = u_o;
        this.b_o = b_o;
    }

    @Override
    public PrimitiveMatrix compute(PrimitiveMatrix input) {
        return null;
    }


    /*
    public PrimitiveMatrix compute(PrimitiveMatrix input) {
        //Add zero padding if the input is shorter than the expected by the architecture
        if (this.layerNum == 0) {
            input = dimensionsFix(input);
        }

        ArrayList<PrimitiveMatrix> outputs = new ArrayList();

        // Let's define previous cell output and hidden state
        BasicMatrix.Builder<PrimitiveMatrix> h_t_1 = PrimitiveMatrix.FACTORY.makeZero(this.W_i.countColumns(), 1).copy();
        BasicMatrix.Builder<PrimitiveMatrix> C_t_1 = PrimitiveMatrix.FACTORY.makeZero(this.W_i.countColumns(), 1).copy();

        for (int i = 0; i < input.countColumns(); i++) {
            //Weights update for every cell step-by-step.
            //For more details check out: http://deeplearning.net/tutorial/lstm.html
            PrimitiveMatrix x_t = input.getColumnsRange(i, i);
            PrimitiveMatrix W_i_mul_x = this.W_i.transpose().multiply(x_t);
            PrimitiveMatrix U_i_mul_h_1 = this.U_i.transpose().multiply(h_t_1);
            PrimitiveMatrix i_t = new ReLU().activate();


            PrimitiveMatrix i_t = Activations.sigmoid()    ActivationFunction.hardSigmoid(W_i_mul_x.addColumnVector(U_i_mul_h_1).addColumnVector(this.b_i));

            PrimitiveMatrix W_c_mul_x = this.W_c.transpose().multiply(x_t);
            PrimitiveMatrix U_c_mul_h_1 = this.U_c.transpose().multiply(h_t_1);
            PrimitiveMatrix C_tilda = ActivationFunction.tanh(W_c_mul_x.addColumnVector(U_c_mul_h_1).addColumnVector(this.b_c));

            PrimitiveMatrix W_f_mul_x = this.W_f.transpose().multiply(x_t);
            PrimitiveMatrix U_f_mul_h_1 = this.U_f.transpose().multiply(h_t_1);
            PrimitiveMatrix f_i = ActivationFunction.hardSigmoid(W_f_mul_x.addColumnVector(U_f_mul_h_1).addColumnVector(this.b_f));

            PrimitiveMatrix C_t = (i_t.mul(C_tilda)).add(f_i.multiply(C_t_1));

            PrimitiveMatrix W_o_mul_x = this.W_o.transpose().multiply(x_t);
            PrimitiveMatrix U_o_mul_h_1 = this.U_o.transpose().multiply(h_t_1);

            PrimitiveMatrix o_t = ActivationFunction.hardSigmoid(W_o_mul_x.addColumnVector(U_o_mul_h_1).addColumnVector(this.b_o));
            PrimitiveMatrix h_t = o_t.multiply(ActivationFunction.tanh(C_t));

            outputs.add(h_t);
            h_t_1 = h_t;
            C_t_1 = C_t;

        }

        if (this.returnSequence) {
            // We return out sequence corresponding to our input,
            // which has length of this.realSize.
            // We will restore it in next layer again using fixInput()
            long rows = outputs.get(0).countRows();
            BasicMatrix.Builder<PrimitiveMatrix> matrixBuilder = PrimitiveMatrix.FACTORY.makeZero(rows, this.realSize).copy();
            for (int r = 0; r < outputs.size(); r++) {
                for (int c = 0; c < this.realSize; c++) {
                    matrixBuilder.add(r, c, outputs.get(r, c));
                    result.put(i, j, outputs.get(j).get(i));
                }
            }
            return result;

        } else {
            // If we don't want to return sequence of outputs from every cell,
            // but only for the last one (for the last LSTM layer), use this.
            return outputs.get(outputs.size() - 1);
        }
    }

    private PrimitiveMatrix dimensionsFix(PrimitiveMatrix X) {
        BasicMatrix.Builder<PrimitiveMatrix> matrixBuilder = PrimitiveMatrix.FACTORY.makeZero(W_i.countRows(), W_i.countColumns()).copy();
        for (int r = 0; r < X.countRows(); r++) {
            for (int c = 0; c < X.countRows(); c++) {
                matrixBuilder.add(r, c, X.get(r, c));
            }
        }
        return matrixBuilder.build();
    }
    */
}
