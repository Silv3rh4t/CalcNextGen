package ShortHand;
import java.util.regex.*;

public class Fr {
    private final int nom;
    private final int den;
    public Fr(int nom, int den) {
        if (den <= 0)
            throw new IllegalArgumentException("Invalid denominator: " + den);
        this.nom = nom;
        this.den = den;
    }
    public int getNom() {
        return this.nom;
    }
    public int getDen() {
        return this.den;
    }
    @Override
    public String toString() {
        return (this.den == 1 ? String.valueOf(this.nom) : this.nom + "/" + this.den);
    }

    public static Fr prompt( String message) {
        Pattern p = Pattern.compile("\\s*(?:(?:(\\d+)\\s+)?(\\d+)/)?(\\d+)\\s*");
        for (;;) {
            System.out.print(message + ": ");
            String line = u.iSs();
            Matcher m = p.matcher(line);
            if (m.matches()) {
                if (m.start(2) == -1)
                    return new Fr(Integer.parseInt(m.group(3)), 1); // whole number
                int nom = Integer.parseInt(m.group(2));
                int den = Integer.parseInt(m.group(3));
                if (m.start(1) != -1)
                    nom += Integer.parseInt(m.group(1)) * den;
                return new Fr(nom, den);
            }
            System.out.println("** Not a valid fraction. Please enter values like 2/3 or 4 3/7 or 13");
        }
    }

    public static void main(String[] args) {
        for (;;) {
            Fr fraction = Fr.prompt("Enter value");
            if (fraction.getNom() == 0)
                break;
            System.out.println("You entered: " + fraction);
        }
    }
    
    public void displ()
    {
        u.pln(this.den == 1 ? String.valueOf(this.nom) : this.nom + "/" + this.den);
    }
    public boolean equals(Fr f2)
    {
        if (this.nom == f2.getNom()) if (this.den == f2.getDen()) return true;
        return false;
    }
    public Fr simpl()
    {
        int n1=this.nom,d1=this.den;
        int n2,d2;
        n2=n1/Find.HCF(n1,d1);
        d2=d1/Find.HCF(n1,d1);
        return new Fr(n2,d2);
    }

    
}