package CalcBase;
import ShortHand.*;
public class Binary
{
    int k;

    public Binary(int j){
        this.k=j;
    }

    public static Binary in(){
        int n=u.iSi("Enter Number [Binary]");
        boolean c=checkBin(n);
        while (c==false)
        {
            n=u.iSi("Binary can have only '1' & '0'");
            c=checkBin(n);
        }
        return new Binary(n);
    }
    
    public static Binary frmInt(){
        
        return null;
    }
    
    public Binary add(Binary b,Binary c)throws java.io.IOException
    {
        int j=Convert.bindec(b.k);
        int p=Convert.bindec(c.k);
        int ans=j-p;
        return new Binary(Convert.decbin(ans));
    }
    
    

    public static void main()throws java.io.IOException
    {
        int loopc=0;
        int n,n2,k=1,ans,a, opt;
        char o;
        String eq;
        while(loopc==0)
        {
            u.pln("1- Basic Operations");
            u.pln("2- Conversions");
            u.pln("0- Return");
            opt=u.iSi();
            switch (opt)
            {
                case 1:
                n=takeIn("Enter Number [Binary] /enter 0 to input through Decimal");
                if (n==0)
                {
                    n=u.iSi("Enter Number [Decimal]");
                    k=0;
                }
                o=u.iBcO();

                if (k==0)
                {
                    n2= u.iSi("Enter Next Number [Decimal]");
                    ans=Equate.operate(n,o,n2);
                    a=Convert.decbin(ans);

                    u.pln(n+" ["+Convert.decbin(n)+"] "+o+""+n2+" ["+Convert.decbin(n2)+"] ="+ans+" ["+a+"]");
                    eq=n+" "+o+" "+n2+" ";
                    u.l();
                    u.pln("Keep Entering next Operator and numbers simultaneously");
                    u.plnt("or 0 to print the final result");
                    o=u.iBcO("d");
                    while(o!='0')
                    {
                        n=u.iSi("N[Decimal]?");
                        n2=ans;
                        ans = Equate.operate(ans,o,n);
                        a=Convert.decbin(ans);
                        u.pln(n2+" ["+Convert.decbin(n2)+"] "+o+" "+n+" ["+Convert.decbin(n)+"] = "+ans+" ["+a+"]");
                        eq+=o+" "+n+" ";
                        o=u.iBcO("s");
                    }
                }
                else
                {
                    n2=takeIn("Enter Number [Binary]");
                    ans=Convert.decbin(Equate.operate(Convert.bindec(n),o,Convert.bindec(n2)));
                    u.l();
                    u.pln(n+" "+o+" "+n2+" = "+ans);
                    eq=n+" "+o+" "+n2+" ";
                    u.l();

                    u.pln("Keep Entering next Operator and numbers simultaneously");
                    u.plnt("or");
                    u.plnt("0- Print Final Answer");
                    u.plnt("C- Convert to Decimal");
                    u.plnt("D- Switch to Decimal");
                    char valin[]={'0','c','C','d','D','+','-','*','/','^','#'};
                    Equate.help(valin);
                    o=u.iBc(valin,"Enter Operator->");
                    while(o!='0')
                    {
                        n=u.iSi("N[Binary]?");
                        n2=ans;
                        ans = Equate.operate(Convert.bindec(ans),o,Convert.bindec(n));
                        ans=Convert.decbin(ans);
                        u.pln(n2+" "+o+" "+n+" = "+ans);
                        eq+=o+" "+n+" ";
                        o=u.iBc(valin,"Enter Operator->");
                        if (o=='c' || o=='C')
                        {
                            u.pln(Convert.bindec(n2)+" "+o+" "+Convert.bindec(n)+" = "+ans);
                        }
                        if (o=='d' ||o=='D')
                        {
                            Equate.main();
                            break;
                        }
                    }
                    if (o!='d' && o!='D')
                    {
                        eq+="=> "+ans;
                        u.pln(eq);
                    }
                }
                loopc=1;
                break;

                case 2:
                u.plnt("A- Binary  -> Decimal");
                u.plnt("B- Decimal -> Binary");
                char sopt=u.iBc();
                switch (sopt)
                {
                    case 'a':
                    case 'A':
                    u.pln("Converted Binary ->"+Convert.bindec(takeIn("Enter Number[Binary]")));
                    break;

                    case 'b':
                    case 'B':
                    u.pln("Converted Decimal ->"+Convert.decbin(u.iSi("Enter Number[Decimal]")));
                    break;

                    default:
                    u.pln("INVALID OPTION");

                }
                loopc=1;
                break;

                default:
                u.l();
                u.pln("INVALID OPTION");
                u.l();

                case 0:
                loopc=1;
            }
        }
    }

    public static int takeIn(String p)
    {
        u.pln(p);
        return takeIn();
    }

    public static int takeIn()
    {
        int n=u.iSi("Enter Number [Binary]");
        if (n==0)
            return 0;
        boolean c=checkBin(n);;
        while (c==false)
        {
            n=u.iSi("Binary can have only '1' & '0'");
            c=checkBin(n);
        }
        return n;
    }

    public static boolean checkBin(int n)
    {
        int b=n,t;
        boolean c=false;
        while (b!=0)
        {
            t=b%10;
            if (t!=0 && t!=1)
            {
                c=false;
                break;
            }
            else 
            {
                c=true;
            }
            b=b/10;
        }
        return c;
    }

}
