package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class CajadoFogoAtaque extends JogadorAtaque {

    public CajadoFogoAtaque() {
        super(25);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("Jogador usa seu cajado de fogo contra o alvo.");
        super.atacar(armaUsada, alvo);
    }
}
