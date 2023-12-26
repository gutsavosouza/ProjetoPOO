package item.equipavel.arma;

import ataque.jogador.BombaAtaque;

public class Bomba extends Arma {

    public Bomba() {
        super("Bomba", 800, 0, 8, 50, new BombaAtaque());
    }
}
