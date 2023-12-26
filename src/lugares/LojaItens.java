package lugares;

import item.Inventario;

public class LojaItens extends Lugar{

    public LojaItens() {
        super("Loja de Itens");
    }

    @Override
    public void Acoes() {
        super.Acoes(); 
        System.out.println("Sem Monstros");
        System.out.println("Sem Personagens");
    }

    @Override
    public Lugar Lugares(Inventario inventario) {
        return super.Lugares(inventario);
    }


}
