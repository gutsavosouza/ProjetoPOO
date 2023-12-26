package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class Lugar {
    
    private Monstro monstro;
    private Lugar lugar;
    private Personagens personagem = new Personagens();
    private Spawns spawn = new Spawns();
    private Destinos destino = new Destinos();
    String Nome;

    public Lugar(String Nome) {
        this.Nome = Nome;
    }
    
    public Lugar Lugares(Inventario inventario){
        System.out.println("Escolha qual Lugar voce quer ir!");
        return destino.Destino(Nome, inventario);
    }
    
    public Monstro Monstros(){
        System.out.println("Escolha qual monstro voce quer enfrentar!");
        return spawn.Spawn(Nome);
    }
    
    public void Personagens(){
        System.out.println("Personagens: ");
        personagem.Personagens(Nome);
    }
    
    public void Acoes(){
    }

    public String getNome() {
        return Nome;
    }
    
}
