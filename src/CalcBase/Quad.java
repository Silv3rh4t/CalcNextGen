package CalcBase;

import ShortHand.*;
import java.io.*;
public class Quad
{
    public static void main()throws IOException
    {
        u.pln("Enter Terms as per their location in the following Equation");
        u.pln("Equation -> ax(square) [+/-] bx [+/-] c");
        double a=u.iSd("Enter a");
        double b=u.iSd("Enter b");
        double c=u.iSd("Enter c");
        char x=u.iBc("Enter x[variable used]");
        double d= (b*b)-(4*a*c);
        double r1= ((b-(2*b)) + Math.pow(d,0.5))/(2*a);
        double r2= ((b-(2*b)) - Math.pow(d,0.5))/(2*a);
        u.pln(x+"Root 1 => "+r1);
        Decimal.utjc(r1,"Root 1");
        u.pln(x+"Root 2 => "+r2);
        Decimal.utjc(r2,"Root 2");
        u.pln("Determinant => "+d);
        if (d>0)u.pln("Virtual Roots");
        if (d==0)u.pln("Equal roots");
        if (d>0)u.pln("Real roots");
    }
}