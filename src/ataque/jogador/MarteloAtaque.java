package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class MarteloAtaque extends JogadorAtaque {

    public MarteloAtaque() {
        super(25);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("Jogador ataca o alvo com seu martelo.");
        super.atacar(armaUsada, alvo);
    }
}
