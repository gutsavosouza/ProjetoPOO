package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class BombaAtaque extends JogadorAtaque {

    public BombaAtaque() {
        super(50);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("Jogador usa sua bomba para atacar o alvo.");
        super.atacar(armaUsada, alvo);
    }
}
