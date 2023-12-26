package npc.monstro;

import ataque.monstro.LeeverAtaque;
import ataque.monstro.MonstroAtaque;

public class Leever extends Monstro {
    
    public Leever() {
        super(12, "Leever","Comum", new LeeverAtaque());
    }
    
}
