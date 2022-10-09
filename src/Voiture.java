
class Voiture extends VehiculeMotorise {
    public Voiture(String modele) {
        super(modele);
    }
    public void rouler() {

        super.demarrer();
        for (int i = 0; i < 7; i++) {
            String str = modele;
            str += super.moteur.panne(modele);
            if (super.moteur.carburant <= 0) {
                System.out.println(str);
            }
            super.moteur.utiliser(10, modele);

        }
        super.arreter();
    }
    public static void main(String[] args) {

        Voiture voiture = new Voiture("Peugeot");

        voiture.rouler();
    }

}
