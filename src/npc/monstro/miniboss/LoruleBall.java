package npc.monstro.miniboss;

import ataque.monstro.miniboss.LoruleBallAtaque;
import npc.monstro.Monstro;

public class LoruleBall extends Monstro {
    
    public LoruleBall() {
        super(16, "Lorule Ball","Mini Boss", new LoruleBallAtaque());
    }
    
}
