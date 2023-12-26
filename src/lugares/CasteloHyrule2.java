package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class CasteloHyrule2 extends Lugar{

    public CasteloHyrule2() {
        super("Castelo de Hyurle 2 Andar");
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
