package casters;

public class Sorcerer extends Spellcaster {
    @Override
    void castSpell(){
        super.castSpell();
        System.out.println("Meine Zauberkfraft ist mir Angeboren.");
    }

}
