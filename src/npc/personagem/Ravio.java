package npc.personagem;

public class Ravio extends Personagem {

    public Ravio() {
        super(16, "Ravio");
    }

    @Override
    public void fala() {
        System.out.println("Meu nome é Ravio, e este aí é meu companheiro Sheerow. Sou apenas um mercador viajante.");
    }
}
