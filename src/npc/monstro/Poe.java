package npc.monstro;

import ataque.monstro.MonstroAtaque;
import ataque.monstro.PoeAtaque;

public class Poe extends Monstro {

    public Poe() {
        super(16, "Poe","Comum", new PoeAtaque());
    }
    
}
