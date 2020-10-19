package co.simplon;

public class Velo extends Vehicule {
    String typeDeVelo;
    int charge;
    String taille;

    Velo(String marque, String couleur, String typeDeVelo, int charge, String taille) {
        super(marque, couleur, 100);
        this.typeDeVelo = typeDeVelo;
        this.charge = charge;
        this.taille = taille;
    }
}
