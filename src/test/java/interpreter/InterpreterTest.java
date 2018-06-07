package interpreter;

import org.junit.Test;

public class InterpreterTest {

    Expression builInterpreterTree(){

        Expression expr1 = new TerminalExpression("Lions");
        Expression expr2 = new TerminalExpression("Dogs");
        Expression expr3 = new TerminalExpression("Wolfs");

        Expression alternation1 = new AndExpression(expr1, expr2);

        Expression alternation2 = new OrExpression(expr1, alternation1);

        return new AndExpression(expr3, alternation2);
    }

    @Test
    public void testExpressionThreeAndAlternationTwo(){

        String context = "Wolfs Lions";

        Expression wordParser = builInterpreterTree();

        System.out.println(context + " is " + wordParser.interpret(context));
    }

    @Test
    public void testExpressionThreeAndAlternationOne(){

        String context = "Wolfs Lions Dogs";

        Expression wordParser = builInterpreterTree();

        System.out.println(context + " is " + wordParser.interpret(context));
    }


}