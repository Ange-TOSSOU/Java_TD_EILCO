package exercices.banque;

public class Client {
    private static int compteur = 0;
    private int id;
    private final String nom;
    private final String prenom;
    private int nbOperations;

    /**
     * Construit un client de nom et prénom spécifiés
     * @param nom le nom du client
     * @param prenom le prénom du client
     */
    public Client(String nom, String prenom) {
        id = compteur++;
        this.nom = nom;
        this.prenom = prenom;
        nbOperations = 0;
    }

    /**
     * Accède au nom du client
     * @return le nom du client
     */
    public String getNom() { return nom; }
    /**
     * Accède au prénom du client
     * @return le prénom du client
     */
    public String getPrenom() { return prenom; }
    /**
     * Enregistre une nouvelle opération effectuée par le client
     */
    public void enregistreOperation() { nbOperations++; }

    /** Méthode spéciale REPRESENTATION TEXTUELLE. */
    @Override
    public String toString()
    { return "Client(id=" + id + ", nom=" + nom
            + ", prenom=" +prenom +  ", nbOperations="
            + nbOperations + ")";
    }

    /* méthode de comparaison des clients */
    public boolean clientEgal(Client c){
        if (c == this)
            return true;
        return (c.nom.equals(nom) && c.prenom.equals(prenom));
    }


    /** Méthode spéciale COMPARAISON CLIENTS */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client))
            return false;
        Client c = (Client)o;
        return (c.nom.equals(nom) && c.prenom.equals(prenom));
    }
}