package npc.monstro;

import ataque.monstro.MonstroAtaque;
import ataque.monstro.OctorokAtaque;

public class Octorok extends Monstro {

    public Octorok() {
        super(6, "Octorok","Comum", new OctorokAtaque());
    }
    
}
