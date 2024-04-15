package Aufgabe4;

public class Ritter extends Held{
    private int stärke;

    public Ritter(String name, Voelker volk, int stärke){
        super(name, volk);
        this.stärke = stärke;
    }

    public int getStärke() {
        return stärke;
    }

    public void setStärke(int stärke) {
        this.stärke = stärke;
    }

    @Override
    public void zeigeHeldenDaten() {
        System.out.println("Ritter: " + getName());
        System.out.println("Volk: " + getVolk());
        System.out.println("Stärke: " + getStärke());
        super.zeigeHeldenDaten();
    }

}
