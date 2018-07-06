package com.keras4j.activation;

public class Activations {
    private static Activation relu = new ReLU();
    private static Activation sigmoid = new Sigmoid();
    private static Activation softmax = new Softmax();
    private static Activation tanh = new Tanh();

    public static Activation relu(){
        return relu;
    }

    public static Activation sigmoid(){
        return sigmoid;
    }

    public static Activation softmax(){
        return softmax;
    }

    public static Activation tanh(){
        return tanh;
    }
}
