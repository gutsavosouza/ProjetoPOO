package npc.monstro;

import ataque.monstro.RatAtaque;

public class Rat extends Monstro {

    public Rat() {
        super(2, "Rat","Comum", new RatAtaque());
    }
}
