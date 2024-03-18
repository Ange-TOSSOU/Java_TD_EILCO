public class Test {
    private static double generateDouble() {
        double r, sign, x;

        // Generate the Sign
        r = Math.random();
        sign = (r >= 0.5) ? 1.0 : -1.0;

        // Generate the absolute value
        r = Math.random();
        x = r * 11;
        if (x > 10.0) {
            x = 10.0;
        }

        return sign * x;
    }

    public static void main(String[] args) {
        PointCartesien p1, p2, p3;

        p1 = new PointCartesien(generateDouble(), generateDouble());
        p2 = new PointCartesien(generateDouble(), generateDouble());
        p3 = new PointCartesien(generateDouble(), generateDouble());

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        final int length = 3;
        PointCartesien[] tab = {p1, p2, p3};
        int a = 0, b = 1;
        double d = tab[a].distanceAB(tab[b]);
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (tab[i].distanceAB(tab[j]) > d) {
                    a = i;
                    b = j;
                    d = tab[i].distanceAB(tab[j]);
                }
            }
        }
        System.out.println("Les deux points les plus proches: " + tab[a] + " , " + tab[b]);
    }
}
