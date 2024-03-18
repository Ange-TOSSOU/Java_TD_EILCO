import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cercle {
    private PointCartesien centre;
    private double rayon;

    /**
     * Constructeur sans paramètres
     */
    public Cercle() {
        centre = new PointCartesien();
        rayon = 1;
    }
    /**
     * Constructeur avec deux paramètres : le centre du cercle puis son rayon
     */
    public Cercle(PointCartesien centre, double rayon) {
        this.centre = new PointCartesien(centre);
        this.rayon = (rayon > 0) ? rayon : 1;
    }
    /**
     * Retourne le rayon du cercle
     */
    public double getRayon() {
        return rayon;
    }
    /**
     * Modifie le rayon du cercle
     */
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    /**
     * Retourne une copie du centre du cercle
     */
    public PointCartesien getCentre() {
        return centre.copie();
    }
    /**
     * Fais une translation du centre du cercle
     */
    public void translationCentre(double x, double y) {
        centre.translation(x, y);
    }
    /**
     * Retourne la surface du cercle
     */
    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }
    /**
     * Retourne le périmètre du cercle
     */
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
    /**
     * Formate l'affichage des informations du cercle
     */
    @Override
    public String toString() {
        PointCartesien p = this.getCentre();
        BigDecimal cx = BigDecimal.valueOf(p.getX()).setScale(2, RoundingMode.DOWN);
        BigDecimal cy = BigDecimal.valueOf(p.getY()).setScale(2, RoundingMode.DOWN);
        BigDecimal ray = BigDecimal.valueOf(this.getRayon()).setScale(2, RoundingMode.DOWN);
        return "Cercle de centre: (" + cx + ", " + cy + ") et de rayon " + ray;
    }
}
