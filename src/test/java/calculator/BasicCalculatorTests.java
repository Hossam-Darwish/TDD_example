package calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicCalculatorTests {
 private Calculator calculator;
    @BeforeClass
    public void setUp()
    {
       calculator = new Calculator();
    }

    @Test
    public void testAddition(){
       Assert.assertEquals(calculator.add(1, 4), 5);
    }

   @Test
   public void testSubtraction() {
      Assert.assertEquals(calculator.subtract(1, 4), -3);
   }

   @Test
   public void testMultiplication() {
      Assert.assertEquals(calculator.multiply(13, 3), 39);
   }
   
   @Test
   public void testDivision() throws Exception {
      Assert.assertEquals(calculator.divide(13, 3), 4.333333333333333);
   }

   @Test
   public void testSquareRoot(){
      Assert.assertEquals(calculator.getSquareRoot(25.0), 5.0);
   }

}
