import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void additionTest (){
        int result = calculator.addition(2,3);
        System.out.println("Addition result : " + result);
        Assertions.assertEquals(5, result);

    }

    @Test
    public void multiplicationTest (){
        int result = calculator.multiplication(2,3);
        System.out.println("Multiplication result : " + result);
        Assertions.assertEquals(6, result);

    }
}
