package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class MontanhaMorte extends Lugar{

    public MontanhaMorte() {
        super("Montanha da Morte");
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
