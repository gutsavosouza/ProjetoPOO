package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class ArcoAtaque extends JogadorAtaque {

    public ArcoAtaque() {
        super(25);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("Jogador atira com o arco no alvo.");
        super.atacar(armaUsada, alvo);
    }
}
