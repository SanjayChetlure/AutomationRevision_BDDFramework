package Question_Ans;

// Functional interface
interface Calculator1
{
    int add(int a, int b);
}

public class Ex3_WithLambda
{
    public static void main(String[] args)
    {
        // Lambda expression replaces the implementation class
        Calculator1 calc = (a, b) -> a + b;
        System.out.println(calc.add(5, 4)); // Output: 8
    }
}
