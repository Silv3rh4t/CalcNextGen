package ShortHand;
public class Find
{
    public static int HCF(int a,int b)
    {
        int ans=1;
        for (int f=1;f<=a;f++)
        {
            if (a%f==0&&b%f==0)
            {
                ans=f;
            }
        }
        return ans;
    }

    public static int LCM (int a,int b)
    {
        int m =a*b;
        int ans= m/HCF(a,b);
        return ans;
    }
    
    public static int factor(int n){
    	for (int i=2;i<n;i++){
    		if(n%i==0)return i;
    	}
		return n;
    }
}

