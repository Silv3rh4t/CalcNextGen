package QMaker;

import java.util.*;
import CalcBase.*;
import ShortHand.*;
public class Run
{
    public static int s=0,c=0,w=0;
    public static Random rand = new Random();
    public static void main()throws java.io.IOException
    {
        u.pln("This program is made for students to practise Mathematics ->"+"\n"+"This program prints questions and inputs the solution,"+"\n"+"at the end the student gets his report and also is told the correct answer");
        u.l();
        u.pln("Based on CalcNextGen v6");
        u.pln("Made by SilverHat Labs");

        u.pln("____________________________________________QMaker[Beta]__________________________________________________________");
        // u.pln("1- Simple Arithmetic");
        // u.pln("2- Matrices");
        // u.pln("3- Fraction");
        // u.pln("4- Binary");
        int opt=1;//u.iSi();

        
        char opr[]={'+','-','/','*','^','#'};
        char o=opr[r(5)];
        switch (opt)
        {
            case 1:
            int n=2,n2=3;
            int ans=1,ua=1;
            Equate.help(opr);
            while (ua!=0)
            {
                ans=0;
                while (ans==0)
                {
                    o=opr[r(5)];
                    n=r(1000);
                    n2=r(1000); 
                    if (o=='/')
                    	n2=r(100);
                    if (o=='^')
                    	n2=r(5);
                    if (o=='#')
                    {
                    	while(Math.pow(n, 1/n2)!=(int)Math.pow(n, 1/n2)){
                    		n=r(1000);
                    		n2=r(3);
                    	}
                    }
                    if(o=='*')
                    	n=r(100);n2=r(100);
                    ans=Equate.operate(n,o,n2);
                }

                u.pln(n+" "+o+" "+n2+" =>");
                ua=u.iSi();
                check(ua,ans);
            }
            break;
            
            /*case 2:
            int ansm[][]={{1,1},{1,1}};

            while (true==true)
            {
                o=opr[r(3)];

            }*/

        }
    }

    public static int r(int n)
    {
        int k=rand.nextInt(n);
        return k;
    }

    public static void check(int n,int an)
    {
        if (n==an)
        {
            s++;c++;
            u.pln("Correct! Your score= "+s);
        }
        else if(n==0||an==0){}
        else
        {
            s--;w++;
            u.pln("Wrong,Ans= "+an+" Try Next One. Your Score = "+s);
        }
    }
}