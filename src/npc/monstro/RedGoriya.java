package npc.monstro;

import ataque.monstro.MonstroAtaque;
import ataque.monstro.RedGoriyaAtaque;

public class RedGoriya extends Monstro {
    
    public RedGoriya() {
        super(36, "Red Goriya","Comum", new RedGoriyaAtaque());
    }
    
}
