package npc.monstro;

import ataque.monstro.MonstroAtaque;
import ataque.monstro.RopaAtaque;

public class Ropa extends Monstro {

    public Ropa() {
        super(12, "Ropa","Comum", new RopaAtaque());
    }
    
}
