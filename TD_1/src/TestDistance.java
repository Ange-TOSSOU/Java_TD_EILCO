import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestDistance {
    public static void main(String[] args) {
        PointCartesien p1 = new PointCartesien(10.0, 14.0);
        PointCartesien p2 = new PointCartesien(5.0, 5.0);

        BigDecimal distance = BigDecimal.valueOf(p1.distanceAB(p2)).setScale(2, RoundingMode.DOWN);
        System.out.println("Distance: " + distance);
    }
}
