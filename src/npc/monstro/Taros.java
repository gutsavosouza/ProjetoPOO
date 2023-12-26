package npc.monstro;

import ataque.monstro.MonstroAtaque;
import ataque.monstro.TarosAtaque;

public class Taros extends Monstro {

    public Taros() {
        super(10, "Taros","Comum", new TarosAtaque());
    }
    
}
