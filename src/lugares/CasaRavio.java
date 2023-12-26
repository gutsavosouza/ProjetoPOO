package lugares;

import item.Inventario;

public class CasaRavio extends Lugar{

    public CasaRavio() {
        super("Casa do Ravio");
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
    public Lugar Lugares(Inventario inventario) {
        return super.Lugares(inventario);
    }
    
    
}
