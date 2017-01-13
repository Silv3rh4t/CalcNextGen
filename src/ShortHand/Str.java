package ShortHand;
public class Str
{
	public static int countWords(String n)
    {
        int s=countChar(' ',n);
        return ++s;
    }
    public static int countChar(char c,String n)
    {
        int s=0;
        for (int i=0;i<n.length();i++)
        {
            if (n.charAt(i)==c)
            {
                s++;
            }
        }
        return s;
    }
    public static boolean checkInArr(char c[],String n)
    {
        boolean check=true;
        for (int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if (!(Arr.check(ch,c)))check=false;
        }
        return check;
    }
    public static int toInt(String n)
    {
        int num=0;
        while (true)
        {
            if (isInt(n))
            {
                num=Integer.parseInt(n);
                break;
            }
            else
            {
                u.pln("'"+n+"'"+" is not an integer please re-enter THIS integer");
                n=u.iSs();
            }
        }
        return num;
    }
    public static double toD(String n)
    {
        double num=0;
        while (true)
        {
            if (Str.checkInArr(u.digitsD,n))
            {
                num=Double.parseDouble(n);
                break;
            }
            else
            {
                u.pln("Please Enter Numbers only:");
                n=u.iSs();
            }
        }
        return num;
    }
    public static boolean has(char c,String d)
    {
        for (int l=d.length(),i=0;i<l;i++)
        {
            if(d.charAt(i)==c)return true;
        }
        return false;
    }
    public static boolean has(String sub,String dad)
    {
    	char c=sub.charAt(0);
    	if (has(c, dad))
    	{
    		int l=dad.indexOf(c);
    		dad=dad.substring(l);
    		for(@SuppressWarnings("unused")
			int i=l;l<dad.length();l++)
    		{
    			String part=dad.substring(0, sub.length());
    			if (part.equals(sub))
    				return true;
    			dad=dad.substring(part.length());
    		}
    	}
		return false;
    }
    
    public static boolean isInt(String d)
    {
        String n="";
        if (d.charAt(0)=='-') n=d.substring(1);
        else n=d;
        return checkInArr(u.nums,n);
    }
    public static String rev(String n)
    {
        String rev="";
        for (int i=0;i<n.length();i++)
        {
            rev=n.charAt(i)+rev;
        }
        return rev;
    }
}