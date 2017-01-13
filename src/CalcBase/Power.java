package CalcBase;
import ShortHand.*;
public class Power
{
    public static void main()
    {
        System.out.println("What do u want to calculate");
        System.out.println("1-Power");
        System.out.println("2-Root");
        System.out.println("3-Log");
        u.pln("0-Previous Menu");
        int opt= u.iSi();
        double n,p,ans,pf;
        switch (opt)
        {
            case 1:

            System.out.println("Enter the number");
            n=u.iSd();
            System.out.println("Enter Power");
            p=u.iSd();
            u.pln(n+" Raised to "+p+" = "+Math.pow(n,p));
            break;

            case 2:

            System.out.println("Enter the number");
            n=u.iSd();
            System.out.println("Enter Root Power");
            p=u.iSd();
            pf= 1/p;
            ans= Math.pow(n,pf);
            System.out.println(p+" Root "+n+" = "+ans);
            break;

            case 3:

            n=u.iSi("Enter Number");
            ans=Math.log(n);
            u.pln("Log "+n+"= "+ans);
            break;
            
            default:
            System.out.println("Option Not Available");
            break;

            case 0:
        }
    }
}
