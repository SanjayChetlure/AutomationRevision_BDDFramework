package Question_Ans;

public class EX3_Static
{
    public static void main(String[] args) {
        System.out.println(Test.count);
    }
}


class Test {
    static int count = 10;   // static variable

    public static void m1()
    {    // static method
        System.out.println("Static method");
    }
}

