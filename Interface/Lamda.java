package Interface;

interface A
{
    void show(int a);
}

public class Lamda
{
    public static void main(String[] args)
    {
        A obj = (a) -> System.out.println("Value: " + a);

        obj.show(10);
    }
}