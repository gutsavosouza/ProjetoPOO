package npc.monstro;

import ataque.monstro.BlueSwordSoldierAtaque;
import ataque.monstro.MonstroAtaque;


public class BlueSwordSoldier extends Monstro {

    public BlueSwordSoldier() {
        super(4, "Blue Sword Soldier","Comum", new BlueSwordSoldierAtaque());
    }

}
