package Question_Ans;


class father
{
    father()
    {
        System.out.println("father class constructor");
    }
}

class son extends father
{
    son()
    {
        super();
        System.out.println("son constructor");
    }
}

public class Ex2_ConstructorChaining
{
    public static void main(String[] args) {
        son s=new son();
    }

}


