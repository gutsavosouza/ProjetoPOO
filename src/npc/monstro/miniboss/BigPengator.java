package npc.monstro.miniboss;

import ataque.monstro.miniboss.BigPengatorAtaque;
import npc.monstro.Monstro;

public class BigPengator extends Monstro {
    
    public BigPengator() {
        super(16, "Big Pengator","Mini Boss", new BigPengatorAtaque());
    }
    
}
