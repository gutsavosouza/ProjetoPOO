package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class CajadoTornadoAtaque extends JogadorAtaque {

    public CajadoTornadoAtaque() {
        super(50);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("Jogador usa seu cajado de vento contra o alvo.");
        super.atacar(armaUsada, alvo);
    }
}
