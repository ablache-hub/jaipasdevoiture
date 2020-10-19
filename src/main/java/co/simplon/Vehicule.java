package co.simplon;

import java.util.ArrayList;

public class Vehicule {
    String marque;
    String couleur;
    int niveauEnergie;
    int energieMax;
    boolean disponible;

    ArrayList<Option> options;

    Vehicule (String marque, String couleur, int energieMax) {
        this.marque = marque;
        this.couleur = couleur;
        this.niveauEnergie = 0;
        this.disponible = false;
        this.energieMax = energieMax;
    }
}
