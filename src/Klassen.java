/*
Aufgabe 3
    Erstellen Sie bitte die Klassen casters.Spellcaster, casters.Sorcerer, Wizard, casters.WildMagicSorcerer und casters.IllusionWizard:
        casters.Sorcerer und Wizard sind casters.Spellcaster.
        casters.WildMagicSorcerer ist ein casters.Sorcerer und casters.IllusionWizard ist ein Wizard.
        Alle casters.Spellcaster verfügen über die Methode "castSpell()"
        In casters.Spellcaster gibt die Methode "Ich kann zaubern." aus.
        casters.Sorcerer und Wizard überschreiben diese Methode.
        casters.Sorcerer gibt "Ich kann zaubern." und "Meine Zauberkraft ist mir angeboren." aus.
        Wizard gibt "Ich kann zaubern." und "Für meine Zauberkraft musste ich hart arbeiten." aus.
        casters.WildMagicSorcerer und casters.IllusionWizard überschreiben und versiegeln(finalize) die Methode.
        casters.WildMagicSorcerer gibt "Ich kann zaubern.", "Meine Zauberkraft ist mir angeboren." und "Meine Zauber sind unberechenbar." aus.
        casters.IllusionWizard gibt "Ich kann zaubern.", "Für meine Zauberkraft musste ich hart arbeiten." und "Ich habe mich auf Illusionszauber spezialisiert." aus.

    Vermeiden Sie beim Überschreiben der Methode doppelten Code!

    In der Main erzeugen Sie einen wildMagicSorcerer und einen illusionWizard und rufen für beide die castSpell()-Methode auf.

    Erstellen Sie dazu ein Klassendiagramm

                                                casters.Spellcaster
                                                    / \
                                                   /   \
                                                  /     \
                                                 /       \
                                            casters.Sorcerer    Wizard
                                               /          \
                                              /            \
                                             /              \
                                            /                \
                                           /                  \
                                          /                    \
                                  casters.WildMagicSorcerer      casters.IllusionWizard
*/

/* Aufgabe 4
Drei Klassen: Held, Ritter und Magier.
 * Alle Helden haben einen Namen und sind einem Volk zugeordnet (Attribute)
 * Die Völker (Zwerg, Elf, Mensch) sind als Enum-Konstanten verfügbar.
 * Alle Helden werden in einer Liste (statisches Attribut der Klasse 'Held') abgespeichert.
 * Helden unterteilen sich in Ritter und Magier.
 * Alle Ritter haben einen Stärke-Wert, alle Magier einen Wissen-Wert.
 * Jede Klasse verfügt über einen Konstruktor, welcher nur die eigenen Attribute initialisiert.
 * Der Konstruktor der Held-Klasse fügt das Objekt der Held-Liste hinzu. Damit wird doppelter Code vermieden.
 * In der main Methode werden ein Ritter und ein Magier erzeugt und über eine foreach-Schleife werden alle Attribute der Helden,
 * und ob es sich dabei um einen Ritter oder einen Magier handelt, ausgegeben.
 * Bemerkung: Alle Elemente der Held-Liste sind Helden. Stärke und Wissen haben aber jeweils Ritter und Magier.
 * Wie können diese Werte abgefragt werden? Etwas in der Art haben wir im Unterricht besprochen.
 */

/* Aufgabe 5
 Schreiben Sie ein Programm, das
 * - die Klassen Computer, Desktop, Notebook und Server einführt.
 * - Jeder Computer hat einen Zustand (Ein/Aus)
 * - Einen Hersteller, der nur ein mal über den Konstruktor gesetzt werden darf
 * - Eine Statische Liste, die die aktuelle Instanz speichert
 * (die Klasse Computer besitzt eine Liste vom Typ Computer, in die im Konstruktor das Objekt hinzugefügt wird)
 * - Und eine Methode zum Ein- und Ausschalten (Eine Methode, die beides erledigt)
 * (Diese Methode gibt den Typ des Computers und den neuen Zustand aus, siehe Screenshot)
 * (Versuchen Sie diese Ausgabe abhängig vom Zustand in nur einer Zeile zu implementieren)
 * - Überlegen Sie sich eine geeignete Vererbungsstruktur.
 * - Verwenden Sie in den Subklassen die Konstruktor-Verkettung zur Initialisierung des Herstellers in der Basisklasse
 * - Geben Sie im Main für jeden Computer in der Liste den Hersteller aus und rufen Sie die Methode zum Ein- und Ausschalten auf
 * (Siehe Screenshot)
 *
 * Beachten Sie, dass der Zustand nur über die Methode zum Ein- und Ausschalten geändert werden darf!
 *
 * Erweitern Sie anschließend das Programm durch die Klasse Büro
 * - Jedes Büro hat eine Nummer, die nur ein mal durch den Konstruktor gesetzt werden darf
 * - eine Liste mit den sich im Büro befindenden Computern
 * - und eine Statische Liste mit allen Büros
 * - Erweitern Sie die Main so, dass nun anstatt der Computerliste die Büroliste durchlaufen wird
 * (erzeugen Sie dazu zwei Büros mit je zwei Computern)
 * - und rufen Sie für jedes Büro die Nummer und für jeden Computer in jedem Büro den Hersteller und die Methode zum Ein- und Ausschalten auf
 */

import Aufgabe4.Held;
import Aufgabe4.Magier;
import Aufgabe4.Ritter;
import Aufgabe4.Voelker;
import Aufgabe5.Büro;
import Aufgabe5.Computer;
import Aufgabe5.Notebook;
import Aufgabe5.Server;
import casters.IllusionWizard;
import casters.WildMagicSorcerer;


import java.util.ArrayList;
import java.util.Scanner;

public class Klassen {
    public static void zaubern(){
        WildMagicSorcerer wMS = new WildMagicSorcerer();
        IllusionWizard iW = new IllusionWizard();

        System.out.println("Wild Magic Sorcerer:");
        wMS.castSpell();
        System.out.println();
        System.out.println("Illusion Wizard:");
        iW.castSpell();
        System.out.println();


        System.out.println(
                        "                                                 Spellcaster \n" +
                        "                                                    / \\ \n" +
                        "                                                   /   \\ \n" +
                        "                                                  /     \\ \n" +
                        "                                                 /       \\ \n" +
                        "                                            Sorcerer    Wizard \n" +
                        "                                               /           \\ \n" +
                        "                                              /             \\ \n" +
                        "                                             /               \\ \n" +
                        "                                            /                 \\ \n" +
                        "                                           /                   \\ \n" +
                        "                                          /                     \\ \n" +
                        "                                   WildMagicSorcerer       IllusionWizard\n"
        );
    }
    public static void helden(){
        Ritter ritter1 = new Ritter("Blechdose", Voelker.ZWERG, 200);
        Magier magier1 = new Magier("Claudia", Voelker.ELF, 150);
        System.out.println("Heldenliste: ");
        for (Held held : Held.getHeldenListe()){
            held.zeigeHeldenDaten();
        }

    }

    public static void it(){
        //ArryList für Computer
        ArrayList<Computer> computerListe = new ArrayList<>();

        //Erzeugen von Computern
        Computer desktop1 = new Computer("Dell", true);
        Computer notebook1 = new Notebook("HP",false);
        Computer server1 = new Server("IBM",true);

        //Hinzufügen der Computer zur ArrayList
        computerListe.add(desktop1);
        computerListe.add(notebook1);
        computerListe.add(server1);

//        //Ausgabe der Computerinformationen und Statusänderung
//        for(Computer computer : computerListe){
//            System.out.println(computer.toggleStatus());
//        }

        //Klassen erweiterung für Büro
        ArrayList<Büro> büroList = new ArrayList<>();

        Büro büro1 = new Büro(1);
        büro1.addComputer(desktop1);
        büro1.addComputer(notebook1);

        Büro büro2 = new Büro(2);
        büro2.addComputer(server1);
        büro2.addComputer(notebook1);

        //Add to list
        büroList.add(büro1);
        büroList.add(büro2);

        for (Büro büro : büroList){
            for (Computer computer : büro.getComputerArrayList()){
                System.out.println("Büro " + büro.getNummer()+ ": " + computer.toggleStatus() );
            }
        }




    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wähle aus welche aufgabe du Möchtest \n 1: Aufgabe 3 mit den Magieren \n 2: Aufgabe 4 mit den Helden \n 3: Aufgabe 5 mit den Büros \n");

        int auswahl = sc.nextInt();


        switch (auswahl){
            case 1: zaubern();break;
            case 2: helden();break;
            case 3: it();break;
        }

    }

}