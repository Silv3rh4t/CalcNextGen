package CalcBase;
//Successfully Tested on int 
//Convert to double -Converted
//Add Modulus Operator also - Added
//Add Equation,Fraction and Matrices in input
import ShortHand.*;
public class Equate
{
    public static char opr[]={'0','+','-','*','/','%','^','#'};
    public static char valin[]={'0','+','-','*','/','%','^','#','h','d','~'};
    public static void main()throws java.io.IOException
    {        
        String k="";
        u.pln("Enter Number");
        double n=u.iSd();
        Equate.help(valin);
        char o=u.iBcO();
        u.pln("Enter Next Number");
        double n2=u.iSd();
        double ans= operate(n,o,n2);
        k=n+" "+o+" "+n2+" ";
        u.pln(n+""+o+""+n2+"=> "+ans);
        u.pln("Keep Entering next Operator and numbers simultaneously");        
        o=u.iBc(valin,"Enter Operator");
        while (o!='0')
        {    
            u.pln("N?");
            n=u.iSd();
            n2=ans;
            ans = operate(ans,o,n);
            u.pln(n2+""+o+""+n+"=> "+ans);
            k+=o+" "+n+" ";
            o=u.iBc(valin,"O?");
            switch (o)
            {
                case 'd':Decimal.utjc(n2,"d");break;
                case 'r':ans=Decimal.intr(ans);u.pln("Rounded Off ans-> "+ans);break;
                case 'h':help(valin);break;
            }
            if (Arr.check(o,opr)==false)o=u.iBc(opr,"O?");
        }
        k+="=>"+ans;
        u.pln(k);
        //Write Equation to file option
    }

    public static double operate(double n, char o,double n2)throws java.io.IOException
    {
        double ans=0;
        if (o=='+')
            ans=n+n2;
        else if (o=='-')
            ans=n-n2;
        else if (o=='*')
            ans=n*n2;
        else if (o=='/')
            ans=n/n2;
        else if (o=='%')
            ans=n%n2;
        else if (o=='^')
            ans=Math.pow(n,n2);
        else if (o=='#')
            ans=Math.pow(n2,(1/n));
        else if (o=='h')
            help();
        return ans;
    }

    public static int operate(int n, char o,int n2)throws java.io.IOException
    {
        int ans=0;
        if (o=='+')
            ans=n+n2;
        else if (o=='-')
            ans=n-n2;
        else if (o=='*')
            ans=n*n2;
        else if (o=='%')
            ans=n%n2;
        else if (o=='^')
            ans=Decimal.intr(Math.pow(n,n2));
        else if (o=='/')
            ans=n/n2;
        else
        {u.pln("Note-> Answers will be rounded off");}
        if (o=='#')
            ans=Decimal.intr(Math.pow(n2,(1/n)));

        return ans;
    }

    public static void help(){help(valin);}

    public static void help(char opt[])
    {
        if (Arr.check('+',opt))u.plnt("+ -> Add");
        if (Arr.check('-',opt))u.plnt("- -> Substract");
        if (Arr.check('*',opt))u.plnt("* -> Multiply");
        if (Arr.check('/',opt))u.plnt("/ -> Divide");
        if (Arr.check('%',opt))u.plnt("% -> Modulus [Remainder]");
        if (Arr.check('^',opt))u.plnt("^ -> Power");
        if (Arr.check('#',opt))u.plnt("# -> Root");
        if (Arr.check('d',opt))u.plnt("d -> Decimal Conversions");
        if (Arr.check('~',opt))u.plnt("~ -> Round Off");
        if (Arr.check('0',opt))u.plnt("0 -> Print Final Result");
    }
}