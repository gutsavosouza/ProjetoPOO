package npc.personagem;

//Yuga vai ser um dos chefões(NPC.monstro) do jogo futuramente, por isso a distinção na nomenclatura

public class YugaPersonagem extends Personagem {

    public YugaPersonagem() {
        super(20, "Yuga");
    }

    @Override
    public void fala() {
        System.out.println("Sou o maior feiticeiro de Hyrule, Yuga! E vou transformar todos em obras de artes lindas para minha coleção.");
    }
}
