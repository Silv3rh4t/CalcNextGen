package ShortHand;
import java.io.*;
public class Convert 
{
    public static void frdec(int n,int d)
    {
        double ans=n/d;
        System.out.println("Converted Decimal=> "+ans);
    }

    public static void decfr(double dec, String f)
    {
        if (f.equals("d"))
            f="Answer";
        double n=dec;
        int d=1;
        while ((int) n!=n)
        {
            d=d*10;
            n=n*10;
        }
        System.out.println(f+" after conversion"+"=> "+(int) n+"/"+d);
        Fr p=new Fr((int) n,d);
        p.displ();
    }

    public static void frwhole(int n,int d)
    {
        u.pln((int)n/d+"(whole) "+(n%d)+"/"+d);
    }

    public static int decbin(int n)throws IOException
    {
        String ans="";
        char temp=' ';
        while(n!=0)
        {
            if (n%2==0)
                temp='0';
            else 
                temp='1';
            ans=temp+ans;
            n=n/2;
        }
        ans = ans.trim();
        int ret= Integer.parseInt(ans);  
        return ret;
    }

    public static int bindec(int n)
    {
        int t,d=0,tp;
        for (int i=0;n!=0;i++)
        {
            t=n%10;
            if (t!=1 && t!=0)
            {
                u.pln("Error -> Binary can have only '1' and '0'");
                break;
            }
            tp=(int) Math.pow(2,i);
            if (t==1)
                d=d+ (t*tp);
            n=n/10;
        }
        return d;
    }
}
