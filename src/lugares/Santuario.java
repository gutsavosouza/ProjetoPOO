package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class Santuario extends Lugar{

    public Santuario() {
        super("Santuario");
    }

    @Override
    public void Acoes() {
        super.Acoes();
        System.out.println("Sem Monstros");
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
