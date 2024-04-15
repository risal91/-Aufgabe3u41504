package Aufgabe4;

public class Magier extends Held {
    private int wissen;

    public Magier(String name, Voelker volk, int wissen){
        super(name, volk);
        this.wissen = wissen;
    }

    public int getWissen() {
        return wissen;
    }

    public void setWissen(int wissen) {
        this.wissen = wissen;
    }
    @Override
    public void zeigeHeldenDaten() {
        System.out.println("Magier: " + getName());
        System.out.println("Volk: " + getVolk());
        System.out.println("Wissen: " + getWissen());
        super.zeigeHeldenDaten();
    }
}
