public class Moteur {
    int carburant;
    int conso = 0;
    public Moteur(int carburant){
        this.carburant = carburant;
    }
    public boolean demarrer(){
        if(carburant>0){
            System.out.println("Le moteur est demarré avec " + this.carburant + " litres dans le réservoir");
            System.out.println("Je viens de consommer 1 litre pour démarrer");
            this.carburant--;
            this.conso += 1;
            return true;
        }
        else return false;
    }
    public int utiliser(int carburantUtilise, String v){
        if (this.conso > 50){
           System.out.println(panne(v));
        }
        if (getCarburant() < carburantUtilise){
          System.out.println(faireLePlein(100, v));
        }
        else {
            this.conso += carburantUtilise;
            this.carburant -= carburantUtilise;
            System.out.println("Le moteur utilise " +carburantUtilise + " litres" + " ----> " + "Il reste " + this.carburant + " litres");
            System.out.println("Je viens de consommer " + conso + " litres");
            return this.carburant;
        }
        return this.carburant;
    }
    public void arreter(){
        System.out.println("Le moteur est arreté");
    }
    public int getCarburant(){
        return this.carburant;
    }
    public void setCarburant(int carburant){
        this.carburant = carburant;
    }
    public String faireLePlein(int plein, String s){
        setCarburant(this.carburant + plein);
        this.conso = 0;
        return s + " a reçu " + plein + " litres dans le réservoir";
    }
    public String panne(String s){
        return "-------------------------------------------------------------------" +"\n" + "La " + s + " vient de tomber en panne " +"\n" +" ---------------------------------------------------------------------";
    }

}
