package casters;

public class Wizard extends Spellcaster {

    @Override
    void castSpell(){
        super.castSpell();
        System.out.println("Für meine Zauberkraft musste ich hart arbeiten.");
    }
}
