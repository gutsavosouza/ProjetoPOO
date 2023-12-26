package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class Cartomante extends Lugar{

    public Cartomante() {
        super("Cartomante");
    }

    @Override
    public void Acoes() {
        super.Acoes();
        System.out.println("Sem Monstros");
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
