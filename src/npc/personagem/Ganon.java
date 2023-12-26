package npc.personagem;

public class Ganon extends Personagem {

    public Ganon() {
        super(26, "Ganon");
    }

    @Override
    public void fala() {
        System.out.println("Eu sou Ganon, o Rei Demônio. O GRANDE LADRÃO!!");
    }
}
