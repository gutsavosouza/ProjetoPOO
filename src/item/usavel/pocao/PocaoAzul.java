package item.usavel.pocao;

import entidade.Entidade;

public class PocaoAzul extends Pocao{

    final private int curaRealizada = 8 * 8;
    
    public PocaoAzul() {
        super("Pocao Azul", 0, 0, "Cura o alvo em 8 corações");
    }

    @Override
    public void usarPocao(Entidade alvo) {
        if(!foiUsada){
            alvo.curar(this.curaRealizada);
            this.foiUsada = true;
        } else{
            System.out.println("Poção já foi usada");
        }
    }
    
}
