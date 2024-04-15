/*
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

/* Drei Klassen: Held, Ritter und Magier.
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

import Aufgabe4.Held;
import Aufgabe4.Magier;
import Aufgabe4.Ritter;
import Aufgabe4.Voelker;
import casters.IllusionWizard;
import casters.WildMagicSorcerer;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int auswahl = sc.nextInt();

        switch (auswahl){
            case 1: zaubern();break;
            case 2: helden();break;
        }

    }

}