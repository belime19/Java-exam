import java.util.Date;

public class Patron extends Employe{
    private static final int CA=1000000;
    private int pourcentage;

    public Patron(int matricule, String nom, String prenom, Date dateDeNaissance, int pourcentage) {
        super(matricule, nom, prenom, dateDeNaissance);
        this.pourcentage = pourcentage;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    @Override
    public String toString() {
        return super.toString() + "pourcentage= " + pourcentage;
    }

    @Override
    public int getSalaire() {
        return CA*pourcentage/100;
    }
}
