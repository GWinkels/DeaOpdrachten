package nl.han.dea;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Gioo on 14/09/2017.
 */
public class StringCalculatorTest {

    private StringCalculator calc;

    @Before
    public void setup(){
        calc = new StringCalculator();
    }

    @Test
    public void EmptyStringReturnsZero() {
        int sum = calc.Add("");
        Assert.assertEquals(0, sum);
    }

    @Test
    public void AddUpOneNumberInString() {
        int sum = calc.Add("1");
        Assert.assertEquals(1, sum);
    }

    @Test
    public void AddUpTwoNumbersInString() {
        int sum = calc.Add("1, 5");
        Assert.assertEquals(6, sum);
    }
}

