package item.equipavel.arma;

import ataque.jogador.CajadoGeloAtaque;

public class CajadoGelo extends Arma {

    public CajadoGelo() {
        super("Cajado de Gelo", 1200, 0, 4, 100, new CajadoGeloAtaque());
    } 
}
