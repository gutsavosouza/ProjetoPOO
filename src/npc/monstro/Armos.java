package npc.monstro;

import ataque.monstro.ArmosAtaque;

public class Armos extends Monstro {

    public Armos() {
        super(16, "Armos","Comum", new ArmosAtaque());
    }
}
