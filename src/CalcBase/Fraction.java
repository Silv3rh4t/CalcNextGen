package CalcBase;
//Check whether the fraction can be simplified or it already is.
//What if we could use Strings for Fractons - n/d 
//How will we convert these strings to numbers while performing calculations.-> Better to make a new DataType ShortHand.Fr
import ShortHand.*;
public class Fraction
{
    static int num1,den1,num2,den2,ansn1,ansd1,ansn2,ansd2,lcm,s1,s2;
    public static void main()throws java.io.IOException
    {
        Fr fr= Fr.prompt("Enter Fraction 1");
        Fr ans=fr;
        Fr f2=null;
        char[] opr={'+','-','*','/','s','0'};
        Equate.help(opr);
        u.plnt("s -> Simplification menu");
        char o=u.iBc(opr,"Operator:");
        while(o!='0')
        {
            if (o!='s')f2= Fr.prompt("Enter Fraction");
            switch(o)
            {
                case '+':ans=add(ans,f2);break;
                case '-':ans=dif(ans,f2);break;
                case '*':ans=pro(ans,f2);break;
                case '/':ans=div(ans,f2);break;
                case 's':utjc(fr.getNom(),fr.getDen());break;
            }
            ans.displ();
            o=u.iBc(opr,"Operator:");
        }
    }

    public static void utjc(int n,int d)
    {
        Fr f=new Fr(n,d);
        System.out.println("Further Your Option");
        System.out.println("1-Convert to Decimal");
        System.out.println("2-Convert to Percentage");
        if (f.equals(f.simpl()))
            System.out.println("3-Simplify");
        if (n>d)
            u.pln("4-Convert to Whole Fraction");
        System.out.println("0-None");
        int opt=u.iRi();
        switch(opt)
        {
            case 1:
            Convert.frdec(n,d);
            break;

            case 2:
            int ans= (n/d)*100;
            System.out.println(ans);
            break;

            case 3:
            (f.simpl()).displ();
            break;

            case 4:
            Convert.frwhole(n,d);

            default:
            System.out.println("INVALID REQUEST");

            case 0:
        }
    }

    public static Fr add(Fr f,Fr f2)
    {
        int den1=f.getDen();int den2=f2.getDen();
        int num1=f.getNom();int num2=f2.getNom();
        u.pln(den1+" "+den2+" "+num1+" "+num2);
        lcm= Find.LCM(den1,den2);
        s1=lcm/den1;
        num1=num1*s1;
        s2=lcm/den2;
        num2=num2*s2;
        u.pln(num1+" "+num2);
        int num=num1+num2;
        return new Fr(num,lcm);
    }

    public static Fr dif(Fr f,Fr f2)
    {
        int den1=f.getDen();int den2=f2.getDen();
        int num1=f.getNom();int num2=f2.getNom();
        u.pln(den1+" "+den2+" "+num1+" "+num2);
        lcm= Find.LCM(den1,den2);
        s1=lcm/den1;
        num1=num1*s1;
        s2=lcm/den2;
        num2=num2*s2;
        int num=num1-num2;
        return new Fr(num,lcm);
    }

    public static Fr pro(Fr f,Fr f2)
    {
        ansn1=num1*num2;
        ansd1=den1*den2;
        return new Fr(ansn1,ansd1);
    }

    public static Fr div(Fr f,Fr f2)
    {
        ansn1=num1*den2;
        ansd1=den1*num2;
        return new Fr(ansn1,ansd1);
    }

}