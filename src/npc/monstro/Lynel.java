package npc.monstro;

import ataque.monstro.LynelAtaque;
import ataque.monstro.MonstroAtaque;

public class Lynel extends Monstro {

    public Lynel() {
        super(20, "Lynel","Comum", new LynelAtaque());
    }
    
}
