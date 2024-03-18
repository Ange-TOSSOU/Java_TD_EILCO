public class Canard extends Volaille {
    private static double prixDuJour;
    private static double prixAbattage;
    public Canard (double poids) {
        super(poids);
    }
    public double getPrixDuJour() { return prixDuJour; }
    public double getPrixAbattage() { return prixAbattage; }
    public void setPrixDuJour(double prix) {
        prixDuJour = prix;
    }
    public void setPrixAbattage(double prix) {
        prixAbattage = prix;
    }
}
