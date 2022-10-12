
class Voiture extends VehiculeMotorise {
    public Voiture(String modele) {
        super(modele);
    }
    public void rouler() {
        super.demarrer();
        for (int i = 0; i < 7; i++) {
            super.moteur.utiliser(10, modele);
        }
        super.arreter();
    }
    public static void main(String[] args) {

        Voiture voiture = new Voiture("Peugeot");

        voiture.rouler();
    }

}
