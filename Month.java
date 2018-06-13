class Month
{
	String name;
	Month(String n)
	{
		name=n;
	}
	void bdayMonth(String month)
	{
		switch(month)
		{
			case "January":
				System.out.println(name+", your birth month is "+month);
				break;
			case "February":
				System.out.println(name+", your birth month is "+month);
				break;
			case "March":
				System.out.println(name+", your birth month is "+month);
				break;
			case "April":
				System.out.println(name+", your birth month is "+month);
				break;
			case "May":
				System.out.println(name+", your birth month is "+month);
				break;
			case "June":
				System.out.println(name+", your birth month is "+month);
				break;
			case "July":
				System.out.println(name+", your birth month is "+month);
				break;
			case "August":
				System.out.println(name+", your birth month is "+month);
				break;
			case "September":
				System.out.println(name+", your birth month is "+month);
				break;
			case "October":
				System.out.println(name+", your birth month is "+month);
				break;
			case "November":
				System.out.println(name+", your birth month is "+month);
				break;
			case "December":
				System.out.println(name+", your birth month is "+month);
				break;
			default:
				System.out.println("You entered wrong information");
				break;
		}
	}
	public static void main(String args[])
	{
		Month m1=new Month("Priya");
		m1.bdayMonth("March");
		Month m2=new Month("Rohan");
		m2.bdayMonth("Abcd");
	}
}