package Aufgabe5;

import java.util.ArrayList;

public class Computer {
    private String hersteller;
    private boolean eingeschaltet;
    private static ArrayList<Computer> alleComputer = new ArrayList<>();

    public Computer(String hersteller, boolean eingeschaltet) {
        this.hersteller = hersteller;
        this.eingeschaltet = eingeschaltet;
        alleComputer.add(this);
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public boolean isEingeschaltet() {
        return eingeschaltet;
    }

    public void setEingeschaltet(boolean eingeschaltet) {
        this.eingeschaltet = eingeschaltet;
    }

    public static ArrayList<Computer> getAlleComputer() {
        return alleComputer;
    }

    public static void setAlleComputer(ArrayList<Computer> alleComputer) {
        Computer.alleComputer = alleComputer;
    }

    public  String toggleStatus() {
        eingeschaltet = !eingeschaltet;
        return "Der " + getHersteller()+ " " + getClass().getSimpleName() + " wurde " + (eingeschaltet ? "EIN" : "AUS") + " geschalten.";
    }

}
