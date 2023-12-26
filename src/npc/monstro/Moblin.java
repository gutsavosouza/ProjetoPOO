package npc.monstro;

import ataque.monstro.MoblinAtaque;

public class Moblin extends Monstro {

    public Moblin() {
        super(10, "Moblin","Comum", new MoblinAtaque());
    }
    
}
