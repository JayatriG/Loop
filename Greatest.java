class Greatest
{
	void greatest(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+" is the greatest");
			}	
			else
			{
				System.out.println(z+" is the greatest");
			}
		}
		else if(y>z)
		{
			System.out.println(y+" is the greatest");
		}
		else
		{
			System.out.println(z+" is the greatest");
		}
	}
	public static void main(String args[])
	{
		Greatest g1=new Greatest();
		g1.greatest(15,8,32);
	}
}