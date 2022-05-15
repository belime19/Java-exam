import java.util.Date;

public abstract class Employe {
    private int matricule;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;

    public Employe(int matricule, String nom, String prenom, Date dateDeNaissance){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Matricule= " + matricule + ", Nom= " + nom + ", Prénom= " + prenom + ", Date De Naissance= " + dateDeNaissance;
    }

    public abstract int getSalaire();


}
