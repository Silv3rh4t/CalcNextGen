package Prob;

/**
 * Created by Akhand Yaduvanshi[SilverHat] on 12/23/2016 using IntelliJ.
 */
public class Fact {
    public double nr(int n,int r){
        return calc(n)/(calc(r)*calc(n-r));
    }
    public int calc(int n){
        int fact=1;
        for (int i=2;i<=n;i++) {
            fact*=i;
        }
        return fact;
    }
}
