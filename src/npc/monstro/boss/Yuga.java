package npc.monstro.boss;

import ataque.monstro.boss.YugaAtaque;
import npc.monstro.Monstro;

public class Yuga extends Monstro {
    
    public Yuga() {
        super(120, "Yuga","Boss", new YugaAtaque());
    }
    
}
