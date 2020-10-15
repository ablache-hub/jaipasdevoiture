package co.simplon;

import java.util.ArrayList;

public class Agence {
    String ville;
    ArrayList<Voiture> stock;

    public Agence (String ville) {
        this.ville = ville;
        this.stock = new ArrayList<Voiture>();
    }

    void ajouterVoitureDansStock(Voiture voiture) {
        this.stock.add(voiture);
        System.out.println(voiture.marque + " " + voiture.couleur + " ajouté");
    }

    void afficherStock(){
        for (Voiture voiture : stock) {
            System.out.println(voiture.getChaine());
        }
    }

    String getChaine(){
        return "Agence de " + this.ville;
    }

    void rentrerDuStock(){
        Voiture renault = new Voiture("Renault","noire");
       // System.out.println(renault.getChaine());
        Voiture ferrari = new Voiture("Ferrari", "rouge");
        this.ajouterVoitureDansStock(renault);
        this.ajouterVoitureDansStock(ferrari);
    }
}
