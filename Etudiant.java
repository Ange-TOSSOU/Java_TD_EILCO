package etudiant;

public class Etudiant {
    private static  int compteur =0;
    private String nom;
    private String prenom;
    private int numero;
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = compteur;
        compteur++;
    }
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public String getNumero() {return numero;}
    public void setNom(String nouveauNom) {this.nom = nouveauNom;}
    public void setPrenom(String nouveauPrenom) {this.prenom =  nouveauPrenom;}
    public static int getCompteur() {return this.compteur;}
    @Override
    public String toString() {
        return  (nom+" " + nom + prenom + ": numero =" + numero);
    }
}
