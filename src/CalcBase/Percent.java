package CalcBase;
import ShortHand.*;
public class Percent   
{
    public static void main()
    {
        int loopc=0;
        while (loopc==0)
        {
            u.pln("n*p/100=a");
            System.out.println("What to Find");
            System.out.println("1-Percentage [a]");
            System.out.println("2-Number [n]");
            System.out.println("3-What Percentage of a given number is [p]");
            u.pln("0-Return");

            int opt = u.iSi();
            double n,p,a;
            switch(opt)
            {
                case 1:

                System.out.println("Enter the Number");
                n=u.iSd();
                System.out.println("Percent(Without % Sign)");
                p=u.iSd();
                a= ans(n,p);
                System.out.println("a="+a);
                loopc++;
                break;

                case 2:

                u.pln("Enter the Percentage (Without % sign)");
                p=u.iSd();
                u.pln("Enter the Answer[a]");
                a=u.iSd();
                n=(a*100)/p;
                u.pln("n="+n);
                loopc++;
                break;

                case 3:

                u.pln("Enter the Number[n]");
                n=u.iSd();
                u.pln("Enter the Answer[a]");
                a=u.iSd();
                p=(a*100)/n;
                u.pln("p="+p);
                loopc++;
                break;

                default:

                u.pln("INVALID OPTION");
                break;
                case 0:
                loopc=1;
            }
        }
    }

    public static double ans(double n,double p)
    {
        double a= n*(p/100);
        return a;
    }
}
