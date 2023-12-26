package npc.personagem;

import npc.Npc;

public abstract class Personagem extends Npc {

    public Personagem(int vida, String nome) {
        super(nome, vida, "Passivo");
    }

    public abstract void fala(); // fala introdutória do NPC.personagem
}
