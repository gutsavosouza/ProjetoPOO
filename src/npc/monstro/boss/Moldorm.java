package npc.monstro.boss;

import ataque.monstro.boss.MoldormAtaque;
import npc.monstro.Monstro;

public class Moldorm extends Monstro {

    public Moldorm() {
        super(16, "Moldorm","Boss", new MoldormAtaque());
    }

}
