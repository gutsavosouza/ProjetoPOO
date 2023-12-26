package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class RuinasOrientais extends Lugar{

    public RuinasOrientais() {
        super("Ruinas Orientais");
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
