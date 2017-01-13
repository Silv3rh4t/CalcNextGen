package TimeCalc;
import java.io.IOException;
import ShortHand.*;

public class Time {
int h,m;
public int getH() {
	return h;
}
public int getM() {
	return m;
}
public static char[] digits={'0','1','2','3','4','5','6','7','8','9'};
	
	public Time(int ch,int cm) {
		if (checkTime(h,m)==false)
			throw new IllegalArgumentException("Invalid Time");
		this.h=ch;
		this.m=cm;
		while (this.m>59)
		{
			this.m-=60;
			this.h+=1;
		}
	}
	public static Time takeIn(String msg) throws IOException {
		int h,m;
		while(true)
		{
			boolean f=true;
			String in=u.iBs(msg+"[hhmm]");
			for (int i=0;i<5;i++)
			{
					if (Arr.check(in.charAt(i), digits)==false)
					{
						u.pln("Invalid Input");
						f=false;
						break;
					}
			}
			if(f==false)
				continue;
			h=Integer.parseInt(in.substring(0, 2));
			m=Integer.parseInt(in.substring(2));
			if (checkTime(h,m))
				break;
		}
		return new Time(h,m);
	}
	public static boolean checkTime(int h,int m){
		if (h>24||m>59)
			return false;
		if (h<0||m<0)
			return false;
		return true;
	}

}
