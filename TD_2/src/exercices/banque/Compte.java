package exercices.banque;

public class Compte {
    private static int compteur = 0;
    private int id;
    private Client client;
    private double solde;

    public Compte(Client c, double solde) {
        id = compteur++;
        this.client = c;
        this.solde = solde;
    }
    public double getSolde() { return solde; }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void debiter(double solde) {
        this.client.enregistreOperation();
        this.solde -= solde;
    }

    public void crediter(double solde) {
        this.client.enregistreOperation();
        this.solde += solde;
    }

    /** Méthode spéciale COMPARAISON COMPTES */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client))
            return false;
        Compte c = (Compte)o;
        return (this.solde == c.solde) && (this.client.equals(c.client)) && (this.id == c.id);
    }
}