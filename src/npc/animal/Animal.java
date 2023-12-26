package npc;

public class Animal extends Npc {
    private String especie;

    public Animal(int vida, String especie) {
        super("Animal", vida, "Neutro");
        this.especie = especie;
    }
}
