package item.equipavel.arma;

import ataque.jogador.CajadoFogoAtaque;

public class CajadoFogo extends Arma {

    public CajadoFogo() {
        super("Cajado do Fogo", 1200, 0, 4, 100, new CajadoFogoAtaque());
    }
}
