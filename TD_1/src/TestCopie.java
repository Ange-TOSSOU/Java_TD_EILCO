public class TestCopie {
    public static void main(String[] args) {
        PointCartesien p1 = new PointCartesien(10.0, 13.0);
        PointCartesien p2 = p1.copie();
        System.out.println("p1: " + p1 + ", p2: " + p2);

        p2.translation(1.0, 2.0);
        System.out.println("p1: " + p1 + ", p2: " + p2);
    }
}
