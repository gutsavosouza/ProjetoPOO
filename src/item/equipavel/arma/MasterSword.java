package item.equipavel.arma;

import ataque.jogador.JogadorAtaque;
import ataque.jogador.HabilidadeMasterSword;

public class MasterSword extends Espada {

    private JogadorAtaque habilidade;

    public MasterSword(String nome, int dano) {
        super(nome, dano);
        this.habilidade = new HabilidadeMasterSword();
    }
}
