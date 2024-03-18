public class Main {
    public static void main(String[] args) {
        PointCartesien p1;
        // Erreur : p1.positionner(10,10);
        p1 = new PointCartesien();
        PointCartesien p2= new PointCartesien(10,10);
        PointCartesien p3= new PointCartesien(p2);
        PointCartesien p4 = p3;
        p4.positionner(14,14);
        System.out.println ("p3="+ p3.toString());
        p2.translation(4,4);
        System.out.println("p1=" + p1 + ",p2=" + p2 + ",p3=" + p3 + ", p4=" + p4);
        System.out.println ("\"p2==p3\"="+(p2==p3));
        System.out.println ("\"p3==p4\"="+(p3==p4));
        System.out.println("\"p2.egaleA(p4)\"=" +p2.egaleA(p4));
        System.out.println ("\"p1=p3\"=" + (p1=p3));

        /*
        PointCartesien p1 = new PointCartesien(10, 14);
        PointCartesien p2 = new PointCartesien(10, 10);
        PointCartesien p3 = new PointCartesien(10, 14);
        p2 = p3;
        */
    }
}
