package lugares;

import item.Inventario;
import jogo.Jogo;
import npc.monstro.Monstro;

public class CasaLink extends Lugar{
    
    public CasaLink() {
        super("Casa do Link");
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
