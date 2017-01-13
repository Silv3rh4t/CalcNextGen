package CalcBase;
import ShortHand.*;
public class Trig
{
   public static void main()throws java.io.IOException
    {
        u.pln("Enter any prescribed Letter followed by the number");
        u.pln("s  -> Sin");
        u.pln("c  -> Cos");
        u.pln("t  -> Tan");
        u.pln("C  -> Cot");
        u.pln("S  -> Sec");
        u.pln("cs -> Cosec");
        String n=u.iSs();
        double ans=solveFunc(n);
        u.pln(""+ans);
        Decimal.utjc(ans,"Value");
    }

    public static double solveFunc(String n)
    {
        double ans=0;
        String num="";
        char ch=n.charAt(0);
        int no=0;
        if (ch=='c'&&n.charAt(1)=='s')
        {
            num=n.substring(1);
            no=Str.toInt(num);
            ans=1/(Math.sin(no));
        }    
        else
        {
            num=n.substring(1);
            no=Str.toInt(num);
            switch(ch)
            {
                case 's':ans=Math.sin(no);break;
                case 'c':ans=Math.cos(no);break;
                case 't':ans=Math.tan(no);break;
                case 'C':ans=1/(Math.tan(no));break;
                case 'S':ans=1/(Math.cos(no));break;
                default:u.pln("INVALID INPUT");
            }
        }
        return ans;
    }
}