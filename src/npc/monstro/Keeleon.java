package npc.monstro;

import ataque.Monstro.KeeleonAtaque;
import ataque.monstro.MonstroAtaque;

public class Keeleon extends Monstro {
    
    public Keeleon() {
        super(24, "Keeleon","Comum", new KeeleonAtaque());
    }
    
}
