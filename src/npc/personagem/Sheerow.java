package npc.personagem;

public class Sheerow extends Personagem {

    public Sheerow() {
        super(4, "Sheerow");
    }

    @Override
    public void fala() {
        System.out.println("Prrwwwz!");
    }
}
