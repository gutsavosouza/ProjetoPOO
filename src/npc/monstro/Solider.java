package npc.monstro;

import ataque.monstro.MonstroAtaque;
import ataque.monstro.SoliderAtaque;

public class Solider extends Monstro {

    public Solider() {
        super(10, "Solider","Comum", new SoliderAtaque());
    }
    
}
