package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        //Given
        Calculator calculator = new Calculator();
        double num1 = 11;
        double num2 = 20;
        double expected = num1 + num2;
        //When
        double actual = calculator.add(num1,num2);
        //Then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void multiplyTest(){
        //Given
        Calculator calculator = new Calculator();
        double num1 = 2;
        double num2 = 20;
        double expected = 40;
        // When
        double actual = calculator.multiply(num1, num2);
        // Then
        assertEquals(expected, actual);

    }

    @Test
    public void checkIfParameterIsNullTest(){

        //given
        Calculator calculator = new Calculator();
        //when
        Double actual = calculator.checkIfParameterIsNull(null);
        //then
        assertNull(actual );

    }

    @Test void isGreater(){
        Calculator calculator = new Calculator();
        int x = 20 ,  y = 5;
        boolean actual = calculator.isGreater(x, y);
        assertTrue(actual, "Checking if X is greater than Y");

    }


    //- Read.The.Freakin.Manual



}