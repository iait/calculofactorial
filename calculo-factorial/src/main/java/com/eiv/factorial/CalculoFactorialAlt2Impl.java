package com.eiv.factorial;

public class CalculoFactorialAlt2Impl implements CalculoFactorial {

    @Override
    public long calcular(int num) {
        if (num == 0) {
            return 1;
        }
        return calcular(num-1) * num;
    }

}
