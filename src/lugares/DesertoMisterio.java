package lugares;

import item.Inventario;
import npc.monstro.Monstro;

public class DesertoMisterio extends Lugar{

    public DesertoMisterio() {
        super("Deserto do Misterio");
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
        return super.Lugares(inventario); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
