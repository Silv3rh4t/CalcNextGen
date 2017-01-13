package CalcBase;

import ShortHand.*;

public class Matrice {
	static int n1[][] = new int[3][3];
	static int n2[][] = new int[3][3];
	static int ans[][] = new int[3][3];
	int mat[][];

	public static void main() throws java.io.IOException {
		takeIn("Matrice 1", n1);
		char opr[] = { '+', '-', '*', '0', 'h' };
		char opt = ' ';
		u.pln("Enter 'h' (without quotes for help)");
		while (opt != 0) {
			opt = u.iBc(opr, "Enter Operator");
			if (opt == '+')
				sum(ans, n2);
			if (opt == '-')
				dif(ans, n2);
			if (opt == '*')
				product(ans, n2);
			if (opt == 'h') {
				Equate.help(opr);
			}
			if (opt == '0')
				break;
			takeIn("Next Matrix", n2);
		}
	}

	public static void dif(int n1[][], int n2[][]) {
		for (int ai = 1; ai <= 2; ai++) {
			for (int aj = 1; aj <= 2; aj++) {
				ans[ai][aj] = n1[ai][aj] - n2[ai][aj];
			}
		}
		u.pln("");
		displ("Solution Matrice", ans);
	}

	public static void product(int n1[][], int n2[][]) {
		ans[1][1] = (n1[1][1] * n2[1][1]) + (n1[1][2] * n2[2][1]);
		ans[1][2] = (n1[1][1] * n2[1][2]) + (n1[1][2] * n2[2][2]);
		ans[2][1] = (n1[2][1] * n2[1][1]) + (n1[2][2] * n2[2][1]);
		ans[2][2] = (n1[2][1] * n2[1][2]) + (n1[2][2] * n2[2][2]);
		displ("Solution Matrice", ans);
	}

	public static void sum(int n1[][], int n2[][]) {
		for (int ai = 1; ai <= 2; ai++) {
			for (int aj = 1; aj <= 2; aj++) {
				ans[ai][aj] = n1[ai][aj] + n2[ai][aj];
			}
		}
		displ("Solution Matrice", ans);
	}

	public static void takeIn(String s, int n[][]) {
		u.pln(s + "->");
		u.pln("Enter Element positioned at");
		for (int i = 1; i <= 2; i++) {
			for (int l = 1; l <= 2; l++) {
				u.plnt("R" + i + " C" + l + "->");
				n[i][l] = u.iSi();
			}
		}
		u.pln("");
		displ(s, n);
	}

	public static void displ(String p, int n[][]) {
		u.pln(p + "->");
		u.l();
		for (int j = 1; j <= 2; j++) {
			for (int pj = 1; pj <= 2; pj++) {
				int print = n[j][pj];
				u.p("" + print);
				u.p("   ");
			}
			u.l();
		}
	}
}