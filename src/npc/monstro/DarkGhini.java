package npc.monstro;

import ataque.monstro.DarkGhiniAtaque;
import ataque.monstro.MonstroAtaque;

public class DarkGhini extends Monstro {
    
    public DarkGhini() {
        super(20, "Dark Ghini","Comum", new DarkGhiniAtaque());
    }
    
}
