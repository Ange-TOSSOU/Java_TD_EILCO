import java.util.ArrayList;
import java.util.List;

public class VecteurReversible {
    private ArrayList<Object> vecteur;
    public VecteurReversible() {
        vecteur = new ArrayList<Object>();
    }
    public int size() {
        return vecteur.size();
    }
    public void add(Object o) {
        this.vecteur.add(o);
    }
    public void remove(Object o) {
        this.vecteur.remove(o);
    }
    public Object get(int i) {
        return this.vecteur.get(i);
    }
    public void reverse() {
        int n = this.vecteur.size();
        for (int i = 0; i < n/2; i++) {
            Object o1 = this.vecteur.get(i);
            Object o2 = this.vecteur.get(n - i - 1);
            this.vecteur.set(n - 1 - i, o1);
            this.vecteur.set(i, o2);
        }
    }
    @Override
    public String toString() {
        String resultat = "";
        for (Object o: this.vecteur) {
            resultat += o.toString() + ", ";
        }
        return resultat;
    }
}
