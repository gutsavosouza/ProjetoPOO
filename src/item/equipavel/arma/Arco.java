package item.equipavel.arma;

import ataque.jogador.ArcoAtaque;

public class Arco extends Arma{

    public Arco() {
        super("Arco", 800, 0, 8, 50, new ArcoAtaque());
    }
}
