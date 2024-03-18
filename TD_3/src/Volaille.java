public class Volaille {
    private static int id = 0;
    private int numeroIndentification;
    private double poids;
    private int ageEnSemaines = 3;
    public Volaille(double poids) {
        numeroIndentification = id++;
        this.poids = poids;
    }
}
