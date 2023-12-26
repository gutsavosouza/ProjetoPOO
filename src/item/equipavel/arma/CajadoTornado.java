package item.equipavel.arma;

import ataque.jogador.CajadoTornadoAtaque;

public class CajadoTornado extends Arma {

    public CajadoTornado() {
        super("Cajado do Tornado", 800, 0, 2, 50, new CajadoTornadoAtaque());
    } 
}
