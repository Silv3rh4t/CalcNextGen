package ShortHand;
public class Arr
{
    public static boolean check(char n,char arr[])
    {
        boolean flag=false;
        for (int i=0;i<arr.length;i++)
        {
            if (n==arr[i])
            {
                flag =true;
                break;
            }
        }
        return flag;
    }
    public static void print(char arr[])
    {
        for (int i=0;i<arr.length;i++)u.pln(arr[i]+"");
    }
    public static void print(String arr[])
    {
        for (int i=0;i<arr.length;i++)u.pln(arr[i]);
    }
}