package co.simplon;

public class Voiture extends Vehicule {
    String typeEnergie;
    int nivEnergie;
    int kilometrage;
    int nbPlace;

    Voiture(String marque, String couleur, int nbPlace, String typeEnergie, int energieMax) {
        super(marque, couleur, energieMax);
        this.typeEnergie = typeEnergie;
        this.nbPlace = nbPlace;
        this.nivEnergie = 0;
        this.kilometrage = 0;
    }

    public String toString() {
        return "voiture: " + this.marque + "-" + this.couleur + "-" + (this.disponible?"oui":"non");
    }
}
