import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestCercle {
    public static void main(String[] args) {
        Cercle c = new Cercle(new PointCartesien(10, 10), 1);

        System.out.println(c);

        BigDecimal p = BigDecimal.valueOf(c.perimetre()).setScale(2, RoundingMode.DOWN);
        BigDecimal s = BigDecimal.valueOf(c.surface()).setScale(2, RoundingMode.DOWN);
        System.out.println("Perimetre : " + p);
        System.out.println("Surface : " + s);

        c.setRayon(2 * c.getRayon());

        p = BigDecimal.valueOf(c.perimetre()).setScale(2, RoundingMode.DOWN);
        s = BigDecimal.valueOf(c.surface()).setScale(2, RoundingMode.DOWN);
        System.out.println();
        System.out.println("Perimetre : " + p);
        System.out.println("Surface : " + s);

        c.translationCentre(-10, -10);

        Cercle c1 = new Cercle(new PointCartesien(0, 0), 2);
        Cercle c2 = new Cercle(new PointCartesien(0, 0), 1);
    }
}
