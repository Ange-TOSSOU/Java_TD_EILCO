package etudiant;

public class MainEtudiant {
    public static void main(String[] args){
            String nom = "Durand";
            String prenom = "Gerard";
            Etudiant et1  =new Etudiant(nom, prenom);
            prenom = null;
            String nom2 = et1.getNom();
            Etudiant et2 = new Etudiant(nom2, "Paul");
            Etudiant et3 = new Etudiant("Durant","Gerard");
            et3 = null;
            et1 = et2;
            et1.setNom("Jacqueline");
            String s = et2.toString();
            System.out.println(s);
            System.out.println(et1);
        }
    }

