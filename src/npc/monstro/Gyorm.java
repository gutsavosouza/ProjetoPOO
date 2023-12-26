package npc.monstro;

import ataque.monstro.GyormAtaque;
import ataque.monstro.MonstroAtaque;

public class Gyorm extends Monstro {
    
    public Gyorm() {
        super(32, "Gyorm","Comum", new GyormAtaque());
    }
    
}
