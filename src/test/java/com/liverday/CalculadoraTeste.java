package com.liverday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jose Gustavo
 * @version 1.0
 * @since release 1.0 da aplicação
 */

public class CalculadoraTeste {

    /**
     * Cenário de Soma
     * O método deverá somar dois números inteiros
     */
    @Test
    public void shouldBeAbleToAddTwoNumbers() {
        //arrange
        double x = 3;
        double y = 2;
        double expectResults = 5;
        //act
        double results = Calculadora.Add(x, y);
        //asserts
        Assertions.assertEquals(expectResults, results);
    }

    /**
     * Cenário de Subtração
     * O método deverá subtrair dois números inteiros
     */
    @Test
    public void shouldBeAbleToSubtractTwoNumbers() {
        //arrange
        double x = 3;
        double y = 2;
        double expectResults = 1;
        //act
        double results = Calculadora.Subtract(x, y);
        //asserts
        Assertions.assertEquals(expectResults, results);

    }

    /**
     * Cenário de Multiplicação
     * O método deverá multiplicar dois números inteiros
     */
    @Test
    public void shouldBeAbleToMultiplyTwoNumbers() {
        //arrange
        double x = 3;
        double y = 2;
        double expectResults = 6;
        //act
        double results = Calculadora.Multiply(x, y);
        //asserts
        Assertions.assertEquals(expectResults, results);

    }

    /**
     * Cenário de Divisão
     * O método deverá dividir dois números inteiros
     */
    @Test
    public void shouldBeAbleToDivideTwoNumbers() {
        //arrange
        double x = 6;
        double y = 2;
        double expectResults = 3;
        //act
        double results = Calculadora.Divide(x, y);
        //asserts
        Assertions.assertEquals(expectResults, results);

    }
}
