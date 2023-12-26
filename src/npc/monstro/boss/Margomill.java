package npc.monstro.boss;

import ataque.monstro.boss.MargomillAtaque;
import npc.monstro.Monstro;

public class Margomill extends Monstro {
    
    public Margomill() {
        super(14, "Margomill","Boss", new MargomillAtaque());
    }
    
}
