package ShortHand;

public class Is {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean prime(int n)
	{
		for (int i=0;i<n/2;i++)
		{
			if (n%i==0)return false;
		}
		return true;
	}
	public static boolean root(int n)
	{
		if ((int) Math.sqrt(n)!=Math.sqrt(n))
			return false;
		else
			return true;
	}

}
