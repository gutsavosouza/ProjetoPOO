package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class CajadoGeloAtaque extends JogadorAtaque {

    public CajadoGeloAtaque() {
        super(25);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("Jogador usa seu cajado de gelo contra o alvo.");
        super.atacar(armaUsada, alvo);
    }
}
