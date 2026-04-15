package Inheritance;

class A
{
	public void show() 
	{
		System.out.println("This is show A");
	}	
}

class B extends A
{
	public void show() 
	{
		System.out.println("This is show B");
		
	}
}

class C extends B
{
	public void show() 
	{
		System.out.println("This is Show C");
	}
}

public class DynamicDispatch 
{
	public static void main(String[] args) 
	{
		
		A obj = new A();
		obj.show();
		
		obj = new B();
		obj.show();
		
		obj = new C();
		obj.show();
		
		
	}

}
