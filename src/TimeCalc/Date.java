package TimeCalc;

import ShortHand.*;
public class Date {
	public static char[] digits={'0','1','2','3','4','5','6','7','8','9'};
	int d=0,m=0,y=0;
	public int getD() {
		return d;
	}
	public int getM() {
		return m;
	}
	public int getY() {
		return y;
	}
	public Date(int dd,int mm,int yy)
	{
		if (checkDate(dd,mm,yy)==false)
			throw new IllegalArgumentException("Invalid Date");
		this.d=dd;
		this.m=mm;
		this.y=yy;
	}	
	public static boolean checkDate(int d,int m,int y)
	{
		if (m<1||d<1||y<1)
			return false;
		if (m>12)
			return false;
		if (m==2&&checkLeap(y)&&d>29)
			return false;
		if (m==2&&!(checkLeap(y))&&m>28)
			return false;
		if ((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&d>31)
			return false;
		if ((m==4||m==6||m==8||m==11)&&d>30)
			return false;
		return true;
	}
	public static boolean checkLeap(int y)
	{
		if (y%100!=0)
		{
			if (y%4==0)
				return true;
		}
		else if (y%400==0)
			return true;
		return false;
	}
	public static Date takeIn(String msg)throws java.io.IOException
	{
		int d,m,y;
		while(true)
		{
			boolean f=true;
			u.pln(msg+"[dd-mm-yyyy]");
			String in=u.iBs();
			if (in.length()!=10)
			{
				u.pln("Please Enter a Valid Date");
				continue;
			}
			for (int i=0;i<10;i++)
			{
				if (i!=2&&i!=5)
				{
					if (Arr.check(in.charAt(i), digits)==false)
					{
						u.pln("Invalid Input");
						f=false;
						break;
					}
				}
			}
			if (f==false)
				continue;
			String t=in.substring(0,2);
			d=Integer.parseInt(t);
			t=in.substring(3,5);
			m=Integer.parseInt(t);
			t=in.substring(6);
			y=Integer.parseInt(t);
			if (checkDate(d,m,y))
				break;
		}
		return new Date(d,m,y);
	}
	@Override
	public String toString() {
		return this.d+"/"+this.m+"/"+this.y;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Date other = (Date) obj;
		if (d != other.d) {
			return false;
		}
		if (m != other.m) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}
}
