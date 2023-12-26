package npc.animal.galinha;

import npc.Animal;

public class Galinha extends Animal {

    private String tipo;

    public Galinha(int vida, String tipo) {
        super(vida, "Galinha");
        this.tipo = tipo;
    }
}
