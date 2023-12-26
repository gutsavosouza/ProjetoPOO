package npc.monstro;

import ataque.monstro.BeeAtaque;

public class Bee extends Monstro {

    public Bee() {
        super(2, "Bee","Comum", new BeeAtaque());
    }
}
