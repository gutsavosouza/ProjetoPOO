package npc.personagem;

public class PrincesaZelda extends Personagem {

    public PrincesaZelda() {
        super(10, "Princesa Zelda");
    }

    @Override
    public void fala() {
        System.out.println("Sou a Princesa Zelda, do Reino de Hyrule. Link, eu tive um sonho estranho...");
    }
}
