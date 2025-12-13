package Question_Ans;

// Functional interface
interface Calculator
{
    int add(int a, int b);
}

// Separate class implementing the interface
class CalculatorImpl implements Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }
}

public class Ex3_WithoutLambda
{
    public static void main(String[] args)
    {
        Calculator calc = new CalculatorImpl();
        System.out.println(calc.add(5, 3)); // Output: 8
    }
}
