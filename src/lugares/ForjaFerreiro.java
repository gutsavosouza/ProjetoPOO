package lugares;

import item.Inventario;

public class ForjaFerreiro extends Lugar{

    public ForjaFerreiro() {
        super("Forja do Ferreiro");
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
    public Lugar Lugares(Inventario inventario) {
        return super.Lugares(inventario); 
    }
    
}
