package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class Cemiterio extends Lugar{

    public Cemiterio() {
        super("Cemiterio");
    }

    @Override
    public void Acoes() {
        super.Acoes();
        System.out.println("Sem Personagens");
    }

    @Override
    public Monstro Monstros() {
        return super.Monstros();
    }

    @Override
    public Lugar Lugares(Inventario inventario) {
        return super.Lugares(inventario); 
    }
    
}
