package exercices.banque;

import java.util.ArrayList;
import java.util.List;

public class Agence {
    private final String nom;
    private List<Compte> comptes;
    private List<Client> clients;

    public Agence(String nom) {
        this.nom = nom;
        comptes = new ArrayList<Compte>();
        clients = new ArrayList<Client>();
    }
    public String getNom() { return nom; }
    public void addCompte(Client client, Compte compte) {
        if (!clients.contains(client))
            clients.add(client);
        if (!comptes.contains(compte));
            comptes.add(compte);
    }

    @Override
    public String toString () {
        String chaine = "\nAgence " + this.nom;
        chaine += "\nListe des clients : \n";
        for (Client c: this.clients) {
            chaine += c.toString() + "\n";
        }
        chaine += "\nListe des comptes : \n";
        for (Compte c: this.comptes) {
            chaine += c.toString() + "\n";
        }

        return chaine;
    }
}