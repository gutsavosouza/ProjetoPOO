package item.equipavel.arma;

import ataque.jogador.BumerangueAtaque;

public class Bumerangue extends Arma{

    public Bumerangue() {
        super("Bumerangue", 800, 0, 6, 50, new BumerangueAtaque());
    }
}
