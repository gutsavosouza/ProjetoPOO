package npc.monstro.miniboss;

import ataque.monstro.miniboss.RedStalfosAtaque;
import npc.monstro.Monstro;

public class RedStalfos extends Monstro {
    
    public RedStalfos() {
        super(8, "Red Stalfos","Mini Boss",new  RedStalfosAtaque());
    }
    
}
