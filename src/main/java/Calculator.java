package jenkins.demo.calc;

import java.lang.*;
import java.util.*;

public class Calculator
{
    private int solution;
    private int x;
    private int y;
    
    public Calculator()
    {
        solution = 0;
        x = 0;
        y = 0;
    }

    public int addition(int x, int y)
    {
       return x + y;
    }
    public int subtraction(int x, int y)
    {
       return x - y;
    }
    public int multiplication(int x, int y)
    {    
       return x * y;
    }
    public int division(int x, int y)
    {
       solution = x / y;
       return solution;
    }
}
