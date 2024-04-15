package Aufgabe4;

import java.util.ArrayList;

public class Held {
    private  String name;
    private  Voelker volk;

    private static ArrayList<Held> heldenListe = new ArrayList<>();

    public Held(String name, Voelker volk){
        this.name = name;
        this.volk = volk;
        heldenListe.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Voelker getVolk() {
        return volk;
    }

    public void setVolk(Voelker volk) {
        this.volk = volk;
    }

    public static ArrayList<Held> getHeldenListe() {
        return heldenListe;
    }

    public static void setHeldenListe(ArrayList<Held> heldenListe) {
        Held.heldenListe = heldenListe;
    }

    public void zeigeHeldenDaten() {
        System.out.println("_________________________");
    }

}
