// handling vs ducking exceptions

class Demo
{
	public void a()
	{
		System.out.println("in a");
		int value = 9;

		b();
	}
	public void b()
	{
		int num1 = 9;
		int num2 = 0;
		try
		{
			int result = num1/num2;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error" + e.getMessage());  // to just get short message not entire error
		}
	}
}

public class Handling
{
	public static void main(String[] agrs)
	{
		Demo obj=new Demo();
		obj.a();
	}
}
