package npc.monstro;

import ataque.monstro.IceWizzrobeAtaque;
import ataque.monstro.MonstroAtaque;


public class IceWizzrobe extends Monstro {
    
    public IceWizzrobe() {
        super(8, "Ice Wizzrobe","Comum", new IceWizzrobeAtaque());
    }
    
}
