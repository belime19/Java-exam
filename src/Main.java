import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employe ouvrier = new Ouvrier(1,"Hanks","Tom",new Date(),10);
        Employe cadre = new Cadre(2,"Depp", "Johnny", new Date(),3);
        Employe patron = new Patron(3,"Hopkins", "Anthony", new Date(), 5);

        System.out.println("Le salaire de " + ouvrier.getPrenom() + " " + ouvrier.getNom() + " est : " + ouvrier.getSalaire());
        System.out.println("Le salaire de " + cadre.getPrenom() + " " + cadre.getNom() + " est : " + cadre.getSalaire());
        System.out.println("Le salaire de " + patron.getPrenom() + " " + patron.getNom() + " est : " + patron.getSalaire());
    }
}
