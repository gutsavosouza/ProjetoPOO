package npc.monstro.boss;

import ataque.monstro.boss.ZaganagaAtaque;
import npc.monstro.Monstro;

public class Zaganaga extends Monstro {
    
    public Zaganaga() {
        super(36, "Zaganaga","Boss", new ZaganagaAtaque());
    }
    
}
