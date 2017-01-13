package ShortHand;
public class Find
{
    public static int HCF(int a,int b)
    {
        int ans=1;
        for (int f=1;f<=a;f++)
        {
            if (a%f==0&&b%f==0)
            {
                ans=f;
            }
        }
        return ans;
    }

    public static int LCM (int a,int b)
    {
        int m =a*b;
        int ans= m/HCF(a,b);
        return ans;
    }
    
    public static char valType(String n)
    {
        if (Str.isInt(n)&&Str.has('.',n))
            return 'd';
        else if (Str.isInt(n))
            return 'i';
        else if (Str.has('/',n))
        {
            int v=n.indexOf('/');
            String p=n.substring(0,v);
            String l=n.substring(v);
            if(Str.isInt(p)&&Str.isInt(l))
                return 'f';
        }
        else if (n.length()==1&&Arr.check(n.charAt(0),CalcBase.Equate.valin))
            return 'o';
        return 'u';
    }
}

