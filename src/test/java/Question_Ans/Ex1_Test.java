package Question_Ans;

abstract class A
{
    A()
    {
        System.out.println("Abstract class constructor");
    }
}

class B extends A
{
    B()
    {
        System.out.println("Subclass constructor");
    }
}

public class Ex1_Test
{
    public static void main(String[] args)
    {
        B obj = new B();
    }
}
