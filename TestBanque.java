package exercices.test;
import exercices.banque.Agence;
import exercices.banque.Client;
import exercices.banque.Compte;
public class TestBanque {
    public static void main(String[] args) {

        Agence agence = new Agence("Société Géniale");
        Client client = new Client("Boniface", "Maurice");
        Client client2 = new Client("xxx", "Maurice");
        System.out.println("Nom client : " + client.getNom());
        System.out.println("Prénom client : " + client.getPrenom());
        Compte compte1 = new Compte(client, 1000);
        Compte compte2 = new Compte(client, 2000);
        agence.addCompte(client, compte1);
        agence.addCompte(client, compte2);
        System.out.println(compte1.getSolde());
        System.out.println(compte2.getSolde());
        compte1.crediter(200);
        compte2.debiter(300);
        System.out.println(compte1.getSolde());
        System.out.println(compte2.getSolde());
    }
}