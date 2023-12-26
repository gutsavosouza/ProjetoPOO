package lugares;

import item.Inventario;
import java.util.Scanner;
import transporte.Bote;
import transporte.Cavalo;
import transporte.VassouraVoadora;

public class Destinos {
    
    private Lugar lugar;
    
    private Bote bote = new Bote();
    private Cavalo cavalo = new Cavalo();
    private VassouraVoadora vassoura = new VassouraVoadora();
      
    private final Scanner scIn = new Scanner(System.in);

    
    public Lugar Destino(String Lugar, Inventario inventario){
        int Escolha = 0;
        if( Lugar == "Casa do Link"){
            lugar = new CasaLink();
            System.out.println("1- Quintal do Link");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar;     
                case 1:
                    lugar = new QuintalLink();;
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Bosque Assombrado"){
            lugar = new BosqueAssombrado();
            System.out.println("1- Quintal do Link");
            System.out.println("2- Forja do Ferreiro");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new QuintalLink();
                    return lugar;
                case 2:
                    lugar = new ForjaFerreiro();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Cartomante"){
            lugar = new Cartomante();
            System.out.println("1- Vila Kakariko");
            System.out.println("2- Castelo de Hyrule");
            System.out.println("3- Santuário");
            System.out.println("4- Casa do Mineiro");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new VilaKakariko();
                    return lugar;
                case 2:
                    lugar = new CasteloHyrule();
                    return lugar;
                case 3:
                    lugar = new Santuario();
                    return lugar;
                case 4:
                    lugar = new CasaMineiro();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Casa da Bruxa"){
            lugar = new CasaBruxa();
            System.out.println("1- Cemitério");
            System.out.println("2- Ruínas Orientais");
            if( inventario.getBote() == true){
                bote.transportar(Lugar);
            }else{
            System.out.println("3- Dominio dos Zora (Bote Necessario)");
            }
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar;
                case 1:
                    lugar = new Cemiterio();
                    return lugar;
                case 2:
                    lugar = new RuinasOrientais();
                    return lugar;
                case 3:
                    if(inventario.getBote() == false){
                        return lugar;
                    }
                    lugar = new DominioZora();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Casa de Gales 1 Andar"){
            lugar = new CasaGales();
            System.out.println("1- Lago Hylia");
            System.out.println("2- Casa de Gales 2 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new LagoHylia();
                    return lugar;
                case 2:
                    lugar = new CasaGales2();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Casa de Gales 2 Andar"){
            lugar = new CasaGales2();
            System.out.println("1- Casa de Gales 1 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasaGales();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Casa Do Mineiro"){
            lugar = new CasaMineiro();
            System.out.println("1- Castelo de Hyrule");
            System.out.println("2- Cartomante");
            System.out.println("3- Santuário");
            System.out.println("4- Floresta Perdida");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasteloHyrule();
                    return lugar;
                case 2:
                    lugar = new Cartomante();
                    return lugar;
                case 3:
                    lugar = new Santuario();
                    return lugar;
                case 4:
                    lugar = new FlorestaPerdida();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Casa do Ravio"){
            lugar = new CasaRavio();
            System.out.println("1- Quintal do Link");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new QuintalLink();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Castelo de Hyrule"){
            lugar = new CasteloHyrule();
            System.out.println("1- Quintal do Link");
            System.out.println("2- Forja do Ferreiro");
            System.out.println("3- Ruínas Orientais");
            System.out.println("4- Santuário");
            System.out.println("5- Cartomante");
            System.out.println("6- Casa do Mineiro");
            System.out.println("7- Castelo de Hyrule 1 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new QuintalLink();
                    return lugar;
                case 2:
                    lugar = new ForjaFerreiro();
                    return lugar;
                case 3:
                    lugar = new RuinasOrientais();
                    return lugar;
                case 4:
                    lugar = new Santuario();
                    return lugar;
                case 5:
                    lugar = new Cartomante();
                    return lugar;
                case 6:
                    lugar = new CasaMineiro();
                    return lugar;
                case 7:
                    lugar = new CasteloHyrule1();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Castelo de Hyrule 1 Andar"){
            lugar = new CasteloHyrule1();
            System.out.println("1- Castelo de Hyrule");
            System.out.println("2- Castelo de Hyrule 2 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasteloHyrule();
                    return lugar;
                case 2:
                    lugar = new CasteloHyrule2();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Castelo de Hyurle 2 Andar"){
            lugar = new CasteloHyrule2();
            System.out.println("1- Castelo de Hyrule 1 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasteloHyrule1();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Cemiterio"){
            lugar = new Cemiterio();
            System.out.println("1- Santuário");
            System.out.println("2- Ruínas Orientais");
            System.out.println("3-Casa da Bruxa");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new Santuario();
                    return lugar;
                case 2:
                    lugar = new RuinasOrientais();
                    return lugar;
                case 3:
                    lugar = new CasaMineiro();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Deserto do Misterio"){
            lugar = new DesertoMisterio();
            System.out.println("1- Ruínas do Sul");
            if( inventario.getBote() == true){
                bote.transportar(Lugar);
            }else{
            System.out.println("2- Palacio do Deserto 1 Andar(Cavalo Necessario)");
            }
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new RuinasSul();
                    return lugar;
                case 2:
                    if(inventario.getBote() == false){
                        return lugar;
                    }
                    lugar = new PalacioDeserto();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Dominio Zora"){
            lugar = new DominioZora();
            System.out.println("1- Casa da Bruxa");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasaBruxa();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Floresta Perdida"){
            lugar = new FlorestaPerdida();
            System.out.println("1- Casa do Mineiro");
            System.out.println("2- Vila Kakariko");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasaMineiro();
                    return lugar;
                case 2:
                    lugar = new VilaKakariko();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Forja do Ferreiro"){
            lugar = new ForjaFerreiro();
            System.out.println("1- Bosque Assombrado");
            System.out.println("2- Castelo de Hyrule");
            System.out.println("3- Vila Kakariko");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new BosqueAssombrado();
                    return lugar;
                case 2:
                    lugar = new CasteloHyrule();
                    return lugar;
                case 3:
                    lugar = new VilaKakariko();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Lago Hylia"){
            lugar = new LagoHylia();
            System.out.println("1- Quintal do Link");
            System.out.println("2- Ruínas Orientais");
            System.out.println("3- Casa de Gales");
            System.out.println("4- Ruínas do Sul");
            System.out.println("0 - Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new QuintalLink();
                    return lugar;
                case 2:
                    lugar =  new RuinasOrientais();
                    return lugar;
                case 3:
                    lugar = new CasaGales();
                    return lugar;
                case 4:
                    lugar = new RuinasSul();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        
        }
        if(Lugar == "Loja de Itens"){
            lugar = new LojaItens();
            System.out.println("1- Vila Kakariko");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new VilaKakariko();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Montanha da Morte"){
            System.out.println("1- Casa do Mineiro");
            System.out.println("2- Torre de Hera");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasaMineiro();
                    return lugar;
                case 2:
                    lugar = new TorreHera();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Palacio do Deserto 1 Andar"){
            lugar = new PalacioDeserto();
            System.out.println("1- Deserto do Misterio");
            System.out.println("2- Palacio do Deserto 2 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new DesertoMisterio();
                    return lugar;
                case 2:
                    lugar = new PalacioDeserto2();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Palacio do Deserto 2 Andar"){
            lugar = new PalacioDeserto2();
            System.out.println("1- Palacio do Deserto 1 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new PalacioDeserto();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Palacio Oriental 1 Andar"){
            lugar = new PalacioOriental();
            System.out.println("1- Ruínas Orientais");
            System.out.println("2- Palácio Oriental 2 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new RuinasOrientais();
                    return lugar;
                case 2:
                    lugar = new PalacioOriental2();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Palacio Oriental 2 Andar"){
            lugar = new PalacioOriental2();
            System.out.println("1- Palacio oriental 1 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new PalacioOriental();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Quintal do Link"){
            lugar = new QuintalLink();
            System.out.println("1- Casa do Link");
            System.out.println("2- Bosque Assombrado");
            System.out.println("3- Ruínas do Sul");
            System.out.println("4- Ruínas Orientais");
            if( inventario.getBote() == true){
                bote.transportar(Lugar);
            }else{
            System.out.println("5- Lago Hylia (Bote Necessario)");
            }
            System.out.println("6- Castelo de Hyrule");
            if( inventario.getBote() == true){
                bote.transportar(Lugar);
            }else{
            System.out.println("7- Casa do Ravio (Vassoura Voadora Necessaria)");
            }
            if( inventario.getBote() == true){
                bote.transportar(Lugar);
            }else{
            System.out.println("8- Montanha da Morte (Vassoura Voadora Necessaria)");
            }
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasaLink();
                    return lugar;
                case 2:
                    lugar = new BosqueAssombrado();
                    return lugar;
                case 3:
                    lugar = new RuinasSul();
                    return lugar;
                case 4:
                    lugar = new RuinasOrientais();
                    return lugar;
                case 5:
                    if(inventario.getBote() == false){
                        return lugar;
                    }
                    lugar = new LagoHylia();
                    return lugar;
                case 6:
                    lugar = new CasteloHyrule();
                    return lugar;
                case 7:
                    if(inventario.getVassoura() == false){
                        return lugar;
                    }
                    lugar = new CasaRavio();
                    return lugar;
                case 8:
                    if(inventario.getVassoura()== false){
                        return lugar;
                    }
                    lugar = new MontanhaMorte();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Ruinas Orientais"){
            lugar = new RuinasOrientais();
            System.out.println("1- Quintal do Link");
            if( inventario.getBote() == true){
                bote.transportar(Lugar);
            }else{
            System.out.println("2- Lago Hylia (Bote Necessario)");
            }
            System.out.println("3- Casa da Bruxa");
            System.out.println("4- Cemitério");
            System.out.println("5- Castelo de Hyrule");
            System.out.println("6- Palácio Oriental");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new QuintalLink();
                    return lugar;
                case 2:
                    if(inventario.getBote() == false){
                        return lugar;
                    }
                    lugar = new LagoHylia();
                    return lugar;
                case 3:
                    lugar = new CasaBruxa();
                    return lugar;
                case 4:
                    lugar = new Cemiterio();
                    return lugar;
                case 5:
                    lugar = new CasteloHyrule();
                    return lugar;
                case 6:
                    lugar = new PalacioOriental();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Ruinas do Sul"){
            lugar = new RuinasSul();
            System.out.println("1- Quintal do Link");
            System.out.println("2- Lago Hylia (Bote Necessario)");
            if( inventario.getBote() == true){
                bote.transportar(Lugar);
            }else{
            System.out.println("2- Lago Hylia (Bote Necessario)");
            }
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new QuintalLink();
                    return lugar;
                case 2:
                    if(inventario.getBote() == false){
                        return lugar;
                    }
                    lugar = new LagoHylia();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Santuario"){
            lugar = new Santuario();
            System.out.println("1- Castelo Hyrule");
            System.out.println("2- Cartomante");
            System.out.println("3- Casa do Mineiro");
            System.out.println("4- Cemitério");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new CasteloHyrule();
                    return lugar;
                case 2:
                    lugar = new Cartomante();
                    return lugar;
                case 3:
                    lugar = new CasaMineiro();
                    return lugar;
                case 4:
                    lugar = new Cemiterio();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Torre de Hera 1 Andar"){
            lugar = new TorreHera();
            System.out.println("1- Montanha da Morte");
            System.out.println("2- Torre de Hera 2 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new MontanhaMorte();
                    return lugar;
                case 2:
                    lugar = new TorreHera2();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Torre de Hera 2 Andar"){
            lugar = new TorreHera2();
            System.out.println("1- Torre de Hera 1 Andar");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new TorreHera();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        if(Lugar == "Vila Kakariko"){
            lugar = new VilaKakariko();
            System.out.println("1- Forja do Ferreiro");
            System.out.println("2- Cartomante");
            System.out.println("3- Loja de Itens");
            System.out.println("0- Sair");
            Escolha = Integer.parseInt(scIn.nextLine());
            switch(Escolha){
                case 0:
                    return lugar; 
                case 1:
                    lugar = new ForjaFerreiro();
                    return lugar;
                case 2:
                    lugar = new Cartomante();
                    return lugar;
                case 3:
                    lugar = new LojaItens();
                    return lugar;
                default:
                    System.out.println("Opcao invalida!");
                    return lugar;
            }
        }
        
        return null;
    }
}
