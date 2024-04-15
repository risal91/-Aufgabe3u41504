package Aufgabe5;

import java.util.ArrayList;

public class Büro {
    private int nummer;
    private ArrayList<Computer> computerArrayList = new ArrayList<>();
    private static ArrayList<Büro> alleBüros = new ArrayList<>();

    public Büro(int nummer ) {
        this.nummer = nummer;
        alleBüros.add(this);
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public ArrayList<Computer> getComputerArrayList() {
        return computerArrayList;
   }

    public void setComputerArrayList(ArrayList<Computer> computerArrayList) {
        this.computerArrayList = computerArrayList;
    }

    public static ArrayList<Büro> getAlleBüros() {
        return alleBüros;
    }

    public static void setAlleBüros(ArrayList<Büro> alleBüros) {
        Büro.alleBüros = alleBüros;
    }

    public void addComputer(Computer computer) {
        computerArrayList.add(computer);
    }

}
