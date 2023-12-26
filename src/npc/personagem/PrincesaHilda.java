package npc.personagem;

public class PrincesaHilda extends Personagem {

    public PrincesaHilda() {
        super(10, "Princesa Hilda");
    }

    @Override
    public void fala() {
        System.out.println("Muito prazer, sou Hilda, a Princesa do Reino de Lorule. ");
    }
}
