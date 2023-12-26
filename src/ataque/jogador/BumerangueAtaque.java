package ataque.jogador;

import entidade.Entidade;
import item.equipavel.arma.Arma;

public class BumerangueAtaque extends JogadorAtaque {

    public BumerangueAtaque() {
        super(12.5);
    }

    @Override
    public void atacar(Arma armaUsada, Entidade alvo) {
        System.out.println("Jogador arremessa seu bumerangue");
        super.atacar(armaUsada, alvo);
    }
}
