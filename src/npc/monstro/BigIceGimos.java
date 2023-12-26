
package npc.monstro;

import ataque.monstro.BigIceGimosAtaque;
import ataque.monstro.MonstroAtaque;


public class BigIceGimos extends Monstro {

    public BigIceGimos() {
        super(20, "BigIceGimos","Comum", new BigIceGimosAtaque());
    }
    
}
