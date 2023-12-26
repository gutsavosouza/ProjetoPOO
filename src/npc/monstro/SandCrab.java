package npc.monstro;

import ataque.monstro.MonstroAtaque;
import ataque.monstro.SandCrabAtaque;

public class SandCrab extends Monstro {

    public SandCrab() {
        super(6, "SandCrab","Comum", new SandCrabAtaque());
    }
    
}
