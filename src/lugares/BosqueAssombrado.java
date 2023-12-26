package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class BosqueAssombrado extends Lugar{

    public BosqueAssombrado() {
        super("Bosque Assombrado");
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
