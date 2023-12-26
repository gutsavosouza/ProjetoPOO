package npc.monstro.miniboss;

import ataque.monstro.miniboss.HeedleAtaque;
import npc.monstro.Monstro;

public class Heedle extends Monstro {
    
    public Heedle() {
        super(12, "Heedle","Mini Boss", new HeedleAtaque());
    }
    
}
