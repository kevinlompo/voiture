public class VehiculeMotorise extends Vehicule{
    Moteur moteur = new Moteur(60);
    public VehiculeMotorise(String modele) {
        super(modele);
    }

    public boolean demarrer(){
        if (moteur.demarrer()){
            return true;
        }
        return false;
    }

    public void arreter(){
        moteur.arreter();
    }
}
