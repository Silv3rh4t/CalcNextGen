package CalcBase;

import ShortHand.*;//Classes u,Str and Arr are in ShortHand
import java.io.*;

public class Equation {
    public static char oprs[] = { '^', '#', '/', '*', '+', '-' };

    public static void main() throws IOException {

        String eq = u.iBs("Enter Equation:");
        while (eq.equals("0") == false) {
            String ans = solve(eq);
            u.pln(eq + " = " + ans);
            u.l();
            eq = u.iBs("Enter next equation or 0");
        }
    }

    public static String solve(String eq) throws IOException {
        while (eq.equals("0") == false) {
            String b = eq;
            String ns1 = "", ns2 = "";
            int n1 = 0, n2 = 0, sol = 0;
            for (int i = 0; i < oprs.length; i++) {
                char oc = oprs[i];
                while (Str.has(oc, eq)) {
                    int ioc = eq.indexOf(oc);
                    int l1 = ioc - 1;
                    int l2 = ioc + 1;
                    for (char we = eq.charAt(l1); (l1 >= 0); l1--) {
                        we = eq.charAt(l1);
                        if (Character.isDigit(we) == false)
                            break;
                        ns1 = ns1 + we;
                    }
                    ns1 = Str.rev(ns1);
                    for (char we2 = eq.charAt(l2); (l2 < eq.length()); l2++) {
                        we2 = eq.charAt(l2);
                        if (Character.isDigit(we2) == false)
                            break;
                        ns2 = ns2 + we2;
                    }
                    ns2 = ns2.trim();
                    n1 = Str.toInt(ns1);
                    n2 = Str.toInt(ns2);
                    sol = Equate.operate(n1, oc, n2);
                    String t1 = "";
                    if (l1 > 0)
                        t1 = eq.substring(0, l1 + 1);
                    b = t1 + sol + eq.substring(l2, eq.length());
                    eq = b;
                    ns1 = "";
                    ns2 = "";
                }
			}
		}
		return eq;
	}
	


}