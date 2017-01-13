package ShortHand; 
import java.util.*;
import java.io.*;

//MY OWN COMMANDS

public class u
{
    public static Scanner sc= new Scanner(System.in);
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static char digits[]={'-','0','1','2','3','4','5','6','7','8','9'};
    public static char digitsD[]={'-','0','1','2','3','4','5','6','7','8','9','.'};
    public static char nums[]={'0','1','2','3','4','5','6','7','8','9'};
    
   /* String inHist,outHist,consHist;
    u(){
        outHist="";
        inHist="";
        consHist="";
    }*/

    //int->
    public static int iSi(){return iRi();}

    public static int iSi(String p){return iRi(p);}

    //String->
    public static String iBs(String n) throws IOException{p(n);return iBs();}

    public static String iBs() throws IOException{String f=br.readLine();return f;}

    public static String iSs(){return sc.nextLine();}

    //Double->
    public static double iSd(){return iRd();}

    public static double iSd(String s){return iRd(s);}

    //Char->
    public static char iBc()throws IOException{return iBs().charAt(0);}

    public static char iBc(String p)throws IOException{return iBs(p).charAt(0);}

    public static char iBc(char array[],String p)throws IOException
    { 
        char r=iBc(p);int flag=0;
        String k=""+array[0];
        for (int i=0;i<array.length;i++)
        {
            if (r==array[i])
            {
                flag=1;
                return r;
            }
            if (i>0)k=k+","+array[i];
        }
        k=k.trim();
        u.pln("ERROR:INVALID INPUT");
        while (flag==0)
        {
            r=iBc("Valid options:- "+k);
            for (int j=0;j<array.length;j++)
            {
                if (r==array[j])
                {
                    return r;
                }
            }
        }
        return ' ';
    }

    public static char iBcO(String n) throws IOException{return iBc(CalcBase.Equate.opr,n);}

    public static char iBcO() throws IOException{return iBc(CalcBase.Equate.opr,"Enter Operator");}

    //Restricted Inputs
    public static int iRi(){int n=Str.toInt(iSs());return n;}

    public static int iRi(String p){ pln(p);return iRi();}

    public static double iRd(String p){pln(p);return iRd();}

    public static double iRd(){double n=Str.toD(iSs());return n;}

    //Printing->
    public static void plnt(String p){System.out.println("\t"+p);}

    public static void l(){pln("");}

    public static void l(int n)
    {
        for (int i=1;i<=n;i++)
            pln("");
    }

    public static void p(String p) {System.out.print(p);}

    public static void pln(String p){System.out.println(p);}

    public static void pln(int i){System.out.println(i);}

    //For all
    /*public static String iR(char arr[])
    {
    String n=iSs();
    boolean flag=false;
    for (int i=0;i<n.length();i++)
    {
    char ch=n.charAt(i);
    for(int j=0;j<arr.length;j++)
    {
    if (ch==arr[j]){
    flag=true;
    break;
    }
    }
    if (flag==false)
    break;
    }

    }*/
}