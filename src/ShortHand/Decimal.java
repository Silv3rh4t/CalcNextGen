package ShortHand;
public class Decimal
{
    public static int intr(double a)//Rounds off to integer
    {
        int b= (int) a;
        double p=a*10;
        int r= (int) p%10;
        if (r<5)
        {
            return b;
        }
        else
        {
            return ++b;
        }
    }

    public static void utjc(double ans, String f) throws java.io.IOException
    {
        if (f.equals("d")==true)
        {
            f="Answer";
        }
        if (count(ans)>2)
        {
            System.out.println("The "+f+" seems very complex. Would you like to choose any of the options below-");
            System.out.println("1-Round off to Whole Number");
            System.out.println("2-Convert to Fraction");
            System.out.println("3-None");
            int opt = u.iSi();
            switch (opt)
            {
                case 1:
                int ret= intr(ans);
                System.out.println("Answer after rounding off: "+ret);
                break;

                case 2:
                Convert.decfr(ans,"Converted "+f);
                break;

                default:
                System.out.println("INVALID OPTION");
                break;

                case 3:
            }
        }
    }
    
    public static double RoundOff(double n)
    {
        double b= n-(int) n;
        double i=b*1000;
        int u= (int) i%10;
        i=n*1000;
        int nn = ((int) i)/10;
        double k=nn;
        if (u<5)
        {
            return (k/100.0);   
        }
        else
        {
            return (k/100.0)+0.01;
        }
    }

    public static int count(double n)
    {
        double b=n;
        int ans=0;
        while ((int) b!=b)
        {
            b=b*10;
            ans=ans+1;
        }
        return ans;
    }
}

