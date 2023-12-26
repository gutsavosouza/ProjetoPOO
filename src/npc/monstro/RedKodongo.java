package npc.monstro;

import ataque.monstro.MonstroAtaque;
import ataque.monstro.RedKodongoAtaque;

public class RedKodongo extends Monstro {
    
    public RedKodongo() {
        super(4, "Red Kodongo","Comum", new RedKodongoAtaque());
    }
    
}
