package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class CasaBruxa extends Lugar{

    public CasaBruxa() {
        super("Casa da Bruxa");
    }

    @Override
    public void Acoes() {
        super.Acoes();
        System.out.println("Sem Monstros");
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
