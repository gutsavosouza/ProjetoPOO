package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class CasteloHyrule extends Lugar{

    public CasteloHyrule() {
        super("Castelo de Hyrule");
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
