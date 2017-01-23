package CalcBase;

import ShortHand.*;
public class Power {

	public static String convert(int n){
		if(Is.root(n)==false){
			int p=1;
			while(Is.root(n)==false){
				p*=n/Find.factor(n);
			}
		}
		else return Integer.toString(n);
		return null;
	}
	

}
