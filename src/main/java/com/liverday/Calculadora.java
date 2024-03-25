package com.liverday;

/**
 * @author Jose Gustavo
 * @version 1.0
 * @since release 1.1 da aplicação
 */
public class Calculadora {

    /**
     *
     * @param Numero1, primeiro valor utilizado para somar
     * @param Numero2, segundo valor utilizado para somar
     * @return, resultado da soma
     */
    public static double Add (double Numero1, double Numero2){
        return Numero1 + Numero2;
    }

    /**
     *
     * @param Numero1, primeiro valor utilizado para Subtrair
     * @param Numero2, segundo valor utilizado para Subtrair
     * @return, resultado da Subtração
     */
    public static double Subtract (double Numero1, double Numero2){
        return Numero1 - Numero2;
    }

    /**
     *
     * @param Numero1, primeiro valor utilizado para multiplicação
     * @param Numero2, segundo valor utilizado para mutiplicação
     * @return, resultado da multiplicação
     */
    public static double Multiply (double Numero1, double Numero2){
        return Numero1 * Numero2;
    }

    /**
     *
     * @param Numero1, primeiro valor utilizado para divisão
     * @param Numero2, segundo valor utilizado para divisão
     * @return, resultado da divisão, caso o valor da Base(Numero2), o resultado será zero
     */
    public static double Divide (double Numero1, double Numero2){
        if(Numero2 == 0)
            return 0;
        return Numero1 / Numero2;
    }
}