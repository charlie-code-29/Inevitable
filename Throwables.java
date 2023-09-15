class  Throwables
{
	public static void main(String[] args)  throws InterruptedException
	{
		try
		{
			System.out.println(10/0);
				
		}
		catch (ArithmeticException e)
		{
			System.out.println(5);
		}
	}
}
