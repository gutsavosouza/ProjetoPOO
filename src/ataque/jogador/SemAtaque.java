package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class SemAtaque extends JogadorAtaque {
    public SemAtaque() {
        super(0);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("O jogador nao possui arma equipada.");
        super.atacar(armaUsada, alvo);
    }
}
