package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class HabilidadeMasterSword extends JogadorAtaque {
    
    final private int dano;

    public HabilidadeMasterSword() {
        super(0);
        this.dano = 6;
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("A Master Sword emite um raio de luz na direção que o jogador observa");
        alvo.receberDano(this.dano);
    }
}
