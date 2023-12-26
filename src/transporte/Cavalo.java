package transporte;

import npc.Animal;

public class Cavalo extends Animal implements Transporte {
    
    private String nome;

    public Cavalo() {
        super(20, "Cavalo");
        this.nome = "Cavalo";
    }

    @Override
    public void transportar(String Local) {
        if(Local == "Deserto do Misterio"){
            System.out.println("2- Palacio do Deserto 1");
            return;
        }
    }
}
