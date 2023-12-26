package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class TorreHera extends Lugar{

    public TorreHera() {
        super("Torre de Hera 1 Andar");
    }

    @Override
    public void Acoes() {
        super.Acoes(); 
        System.out.println("Sem Personagens");
    }

    @Override
    public void Personagens() {
        super.Personagens(); 
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
