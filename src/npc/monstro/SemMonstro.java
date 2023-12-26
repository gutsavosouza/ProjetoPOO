package npc.monstro;

import ataque.monstro.TarosAtaque;

public class SemMonstro extends Monstro{

    public SemMonstro() {
        super(0, "Sem Monstro", "Nenhum", new TarosAtaque());
    }

}
