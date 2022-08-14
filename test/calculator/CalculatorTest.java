package calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;


    @BeforeEach
    public void inItSetup(){

        calculator = new Calculator();
    }

    @Test
    public void test_addTwoNumbers(){
        int sum = calculator.addTwoNumbers(3,5);
        Assertions.assertEquals(sum, 8);


    }

    @Test
    public void test_addTwoNumbersIsInvalid(){
        int sum = calculator.addTwoNumbers(3,5);
        Assertions.assertEquals(sum, 10);

    }

    @Test
    public void test_subtractTwoNumbers(){
        int difference = calculator.subtractTwoNumbers(5,3);
        Assertions.assertEquals(difference, 2);


    }

    @Test
    public void test_divideTwoNumbers(){
        int division = calculator.divideTwoNumbers(4,2);
        Assertions.assertEquals(division, 2);

    }

    @Test
    public void test_multiplyTwoNumbers(){
        int product = calculator.multiplyTwoNumbers(5,3);
        Assertions.assertEquals(product, 15);


    }



}