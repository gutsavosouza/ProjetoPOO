package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class CasaGales2 extends Lugar{

    public CasaGales2() {
        super("Casa de Gales 2 Andar");
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
