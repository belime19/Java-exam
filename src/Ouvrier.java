import java.util.Date;

public class Ouvrier extends Employe{

    private static final int SMIG = 2500;

    private int anciennete;

    public Ouvrier(int matricule, String nom, String prenom, Date dateDeNaissance, int anciennete) {
        super(matricule, nom, prenom, dateDeNaissance);
        this.anciennete = anciennete;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    @Override
    public String toString() {
        return super.toString() + "Ancienneté= " + anciennete;
    }

    @Override
    public int getSalaire() {
        return Math.min(SMIG + (this.anciennete * 100), SMIG * 2);
    }
}
