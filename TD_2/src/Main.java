import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<String>();
        liste.add("première chaîne");
        liste.add(new String("une deuxième chaîne"));
        int i = 0;
        System.out.println("Longueur de la chaîne : " + (liste.get(i)).length());
    }
}
