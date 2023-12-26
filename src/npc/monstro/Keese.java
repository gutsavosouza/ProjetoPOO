package npc.monstro;

import ataque.monstro.KeeseAtaque;
import ataque.monstro.MonstroAtaque;

public class Keese extends Monstro {
    
    public Keese() {
        super(4, "Keese","Comum", new KeeseAtaque());
    }
    
}
