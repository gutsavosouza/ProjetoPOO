package transporte;

public class VassouraVoadora implements Transporte {

    public void Lugares() {
    }

    @Override
    public void transportar(String Local) {
       if(Local == "Quintal do Link"){
            System.out.println("5- Lago Hylia");
            return;
        }
       if(Local == "Quintal do Link"){
            System.out.println("7- Casa do Ravio");
            return;
        }
       if(Local == "Quintal do Link"){
            System.out.println("8- Montanha da Morte");
            return;
        }
    }
}
