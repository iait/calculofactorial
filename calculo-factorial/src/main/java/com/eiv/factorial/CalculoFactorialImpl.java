package com.eiv.factorial;

public class CalculoFactorialImpl implements CalculoFactorial {

    @Override
    public long calcular(int num) {
        long resultado = 1;
        for (int i = 0; i < num; i++) {
            resultado = resultado * (i+1);
        }
        return resultado;
    }

}
