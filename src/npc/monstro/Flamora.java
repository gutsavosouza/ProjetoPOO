package npc.monstro;

import ataque.monstro.FlamoraAtaque;
import ataque.monstro.MonstroAtaque;

public class Flamora extends Monstro {
    
    public Flamora() {
        super(12, "Flamora","Comum", new FlamoraAtaque());
    }
    
}
