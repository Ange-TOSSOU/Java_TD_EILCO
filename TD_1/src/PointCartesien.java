public class PointCartesien {

    private double x;
    private double y;
    public PointCartesien(double x, double y) {
        positionner(x,y);
    }
    public PointCartesien (){
        positionner(0.0,0.0);
    }
    public PointCartesien(PointCartesien p) {
        positionner(p.getX(),p.getY());
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double newX) {
        x = newX;
    }
    public void setY(double newY) {
        y = newY;
    }
    public void positionner(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void translation(double dx, double dy) {
        positionner(x+dx, y + dy);
    }
    public boolean egaleA(PointCartesien p) {
        if (x == p.getX() && y == p.getY())
            return true;
        else
            return false;
    }
    public void rotation(double a) {
        positionner(x * Math.cos(a) - y * Math.sin(a), x * Math.sin(a) + y * Math.cos(a));
    }
    public void rotation(PointCartesien pc, double a) {
        this.translation(-pc.getX(), -pc.getY());
        this.rotation(a);
        this.translation(pc.getX(), pc.getY());
    }
    public PointCartesien copie() {
        return new PointCartesien(this);
    }
    public double distanceAB(PointCartesien p) {
        return Math.sqrt(Math.pow(x-p.getX(), 2) + Math.pow(y-p.getY(), 2));
    }
    @Override
    public String toString() {
        return "PointCartesien{" + x + "," + y + "}" ;
    }
} // Point