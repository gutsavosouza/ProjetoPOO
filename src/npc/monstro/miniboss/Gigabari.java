package npc.monstro.miniboss;


import ataque.monstro.miniboss.GigabariAtaque;
import npc.monstro.Monstro;

public class Gigabari extends Monstro {
    
    public Gigabari() {
        super(20, "Gigabari","Mini Boss", new GigabariAtaque());
    }
    
}
