package CalcBase;
import ShortHand.*;
import java.io.*;
public class Equater
{ 
    public static char opr[]={'0','+','-','*','/','%','^','#'};
    public static char valin[]={'0','+','-','*','/','%','^','#','h','d','r'};
    public static void main()throws IOException
    {        
        String k="";
        u.pln("Enter Number");
        double n=u.iSd();
        Equate.help(valin);
        char o=u.iBcO();
        u.pln("Enter Next Number");
        double n2=u.iSd();
        double ans= Equate.operate(n,o,n2);
        k=n+" "+o+" "+n2+" ";
        u.pln(n+""+o+""+n2+"=> "+ans);
        u.pln("Keep Entering next Operator and numbers simultaneously");        
        o=u.iBc(valin,"Enter Operator");
        while (o!='0')
        {    
            u.pln("N?");
            n=u.iSd();
            n2=ans;
            ans = Equate.operate(ans,o,n);
            u.pln(n2+""+o+""+n+"=> "+ans);
            k+=o+" "+n+" ";
            o=u.iBc(valin,"O?");
            switch (o)
            {
                case 'd':Decimal.utjc(n2,"d");break;
                case 'r':ans=Decimal.intr(ans);u.pln("Rounded Off ans-> "+ans);break;
                case 'h':Equate.help(valin);break;
            }
            if (Arr.check(o,opr)==false)o=u.iBc(opr,"O?");
        }
        k+="=>"+ans;
        u.pln(k);
    }
}