package exercices.banque;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Guibadj", "Rym");
        Client c2 = new Client("Fonlupt", "Cyril");
        Client c3 = new Client("Guibadj", "Rym");

        ArrayList<Client> listeClients = new ArrayList<Client>();
        listeClients.add(c1);
        listeClients.add(c2);
        listeClients.add(c3);

        Client c4 = new Client("Fonlupt", "Cyril");

        System.out.println(listeClients.contains(c2));
    }
}
