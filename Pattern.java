class Pattern
{
	public void pattern()
	{
		int i,j;
		char s='A';
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.println(s);
				s++;
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		p.pattern();
	}
}
		