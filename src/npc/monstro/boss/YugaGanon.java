package npc.monstro.boss;

import ataque.monstro.boss.YugaGanonAtaque;
import npc.monstro.Monstro;

public class YugaGanon extends Monstro {
    
    public YugaGanon() {
        super(200, "Yuga Ganon","Boss", new YugaGanonAtaque());
    }
    
}
