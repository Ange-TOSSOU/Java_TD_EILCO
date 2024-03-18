public class TestRotation {
    public static void main(String[] args) {
        PointCartesien p1 = new PointCartesien(10.0,13.0);
        System.out.println("p1 (avant rotation): " + p1);

        p1.rotation(0.5);
        System.out.println("p1 (apres rotation): " + p1);
    }
}
