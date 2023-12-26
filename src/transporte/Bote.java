package transporte;

public class Bote implements Transporte {

    @Override
    public void transportar(String Local) {
        // Checa o Local do jogador e apartir dele são mostrados os lugares que se pode ir usando o item.
        if(Local == "Casa da Bruxa"){
            System.out.println("3- Dominio dos Zora");
            return;
        }
        if(Local == "Ruinas do Sul"){
            System.out.println("2- Lago Hylia");
            return;
        }
        if(Local == "Ruinas Orientais"){
            System.out.println("2- Lago Hylia");
            return;
        }
        if(Local == "Quintal do Link"){
            System.out.println("5- Lago Hylia");
            return;
        }
    }
}
