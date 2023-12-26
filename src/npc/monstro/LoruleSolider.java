
package npc.monstro;

import ataque.monstro.LoruleSoliderAtaque;
import ataque.monstro.MonstroAtaque;

public class LoruleSolider extends Monstro{

    public LoruleSolider() {
        super(400, "Lorule Solider","Comum", new LoruleSoliderAtaque());
    }
    
}
