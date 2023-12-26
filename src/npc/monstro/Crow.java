package npc.monstro;

import ataque.monstro.CrowAtaque;

public class Crow extends Monstro {

    public Crow() {
        super(4, "Crow","Comum", new CrowAtaque());
    }
}
