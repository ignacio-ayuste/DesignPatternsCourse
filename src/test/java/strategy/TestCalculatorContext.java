package strategy;

import org.junit.Test;

public class TestCalculatorContext {

    private CalculatorContext calculatorContext = new CalculatorContext();

    @Test
    public void testAdd(){
        calculatorContext.setStrategy(new OperationAdd());
        System.out.println("10 + 10 = " + calculatorContext.executeStrategy(10, 10));
    }

    @Test
    public void testSubstract(){
        calculatorContext.setStrategy(new OperationSubstract());
        System.out.println("25 - 10 = " + calculatorContext.executeStrategy(25, 10));
    }

    @Test
    public void testMultiply(){
        calculatorContext.setStrategy(new OperationMultiply());
        System.out.println("10 * 10 = " + calculatorContext.executeStrategy(10, 10));
    }

}
