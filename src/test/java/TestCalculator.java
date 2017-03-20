package jenkins.demo.calc;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
  
  @Test
  public void testAddition()  {
    
    Calculator calc = new Calculator();
    int sumRes = calc.addition(5,5);
    Assert.assertEquals(10,sumRes);
  }

  @Test
  public void testSubtraction()  {
    
    Calculator calc = new Calculator();
    int sumRes = calc.subtraction(5,5);
    Assert.assertEquals(0,sumRes);
  }


  @Test
  public void testMultiplication()  {
    
    Calculator calc = new Calculator();
    int sumRes = calc.multiplication(5,5);
    Assert.assertEquals(25,sumRes);
  }  
  
}
