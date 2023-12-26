package item.equipavel.arma;

import ataque.jogador.MarteloAtaque;

public class Martelo extends Arma {

    public Martelo() {
        super("Martelo", 800, 0, 6, 50, new MarteloAtaque());
    }
}
