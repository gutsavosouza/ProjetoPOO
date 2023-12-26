package npc.monstro;

import ataque.monstro.BlobAtaque;

public class Blob extends Monstro {

    public Blob() {
        super(8, "Blob","Comum", new BlobAtaque());
    }
}
