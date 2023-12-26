package drop;

import entidade.Jogador;
import item.CaudaMonstro;
import item.ChifreMonstro;
import item.EstomagoMonstro;
import item.Inventario;
import item.Item;
import item.equipavel.arma.Arco;
import item.equipavel.arma.Bomba;
import item.equipavel.arma.Bumerangue;
import item.equipavel.arma.CajadoFogo;
import item.equipavel.arma.CajadoGelo;
import item.equipavel.arma.CajadoTornado;
import item.equipavel.arma.Martelo;
import item.equipavel.arma.MasterSwordL1;
import item.equipavel.arma.MasterSwordL2;
import item.equipavel.arma.MasterSwordL3;
import item.usavel.pocao.Pocao;
import item.usavel.pocao.PocaoAzul;
import item.usavel.pocao.PocaoVermelha;
import rupee.BlueRupee;
import rupee.GoldRupee;
import rupee.GreenRupee;
import rupee.PurpleRupee;
import rupee.RedRupee;
import rupee.Rupee;
import rupee.SilverRupee;

public class Drop{
    
    private Rupee green = new GreenRupee();
    private Rupee blue = new BlueRupee();
    private Rupee red = new RedRupee();
    private Rupee purple = new PurpleRupee();
    private Rupee silver = new SilverRupee();
    private Rupee gold = new GoldRupee();
    
    private Item estomago = new EstomagoMonstro();
    private Item chifre = new ChifreMonstro();
    private Item cauda = new CaudaMonstro();
    
    private Pocao pocao1 = new PocaoVermelha();
    private Pocao pocao2 = new PocaoAzul();
    
    public void dropar(Inventario inventario,Jogador jogador ){
        if( inventario.getArma1().getNome() == "Sem arma" && jogador.getArmaPrimariaNome() != "Arco" && jogador.getArmaSecundariaNome() != "Arco"){
            inventario.setArma1(new Arco());
            return;
        }
        if( inventario.getArma2().getNome() == "Sem arma" && jogador.getArmaPrimariaNome() != "Bomba" && jogador.getArmaSecundariaNome() != "Bomba"){
            inventario.setArma2(new Bomba());
            return;
        }
        if( inventario.getArma3().getNome() == "Sem arma" && jogador.getArmaPrimariaNome() != "Cajado do Fogo" && jogador.getArmaSecundariaNome() != "Cajado do Fogo"){
            inventario.setArma3(new CajadoFogo());
            return;
        }
        if( inventario.getArma4().getNome() == "Sem arma" && jogador.getArmaPrimariaNome() != "Martelo" && jogador.getArmaSecundariaNome() != "Martelo"){
            inventario.setArma4(new Martelo());
            return;
        }
        if( inventario.getArma5().getNome() == "Sem arma" && jogador.getArmaPrimariaNome() != "Bumerangue" && jogador.getArmaSecundariaNome() != "Bumerangue"){
            inventario.setArma5(new Bumerangue());
            return;
        }
        if( inventario.getArma6().getNome() == "Sem arma" && jogador.getArmaPrimariaNome() != "Cajado de Gelo" && jogador.getArmaSecundariaNome() != "Cajado de Gelo"){
            inventario.setArma6(new CajadoGelo());
            return;
        }
        if( inventario.getArma7().getNome() == "Sem arma" && jogador.getArmaPrimariaNome() != "Cajado do Tornado" && jogador.getArmaSecundariaNome() != "Cajado do Tornado"){
            inventario.setArma7(new CajadoTornado());
            return;
        }
        
        if( jogador.getEspadaNome() == "Espada esquecida"){
            jogador.setEspada(new MasterSwordL1());
            return;
        }
        
        if( jogador.getEspadaNome() == "Master Sword"){
            jogador.setEspada(new MasterSwordL2());
            return;
        }
        if( jogador.getEspadaNome() == "Master Sword Lv.2"){
            jogador.setEspada(new MasterSwordL3());
            return;
        }
    }
    
    public void dropar(String Tipo, Inventario inventario){
        if( Tipo == "Comum"){
            if( inventario.getBote() == false){
                inventario.setBote(true);
                System.out.println("Bote adicionado ao inventario!");
            }
            if( inventario.getItem1().getNome() == "Sem Item"){
                inventario.setItem1(estomago);
                System.out.println(this.estomago.getNome() + " adicionado no slot 1 de itens!");
                
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            if( inventario.getItem2().getNome() == "Sem Item"){
                inventario.setItem2(estomago);
                System.out.println(this.estomago.getNome() + " adicionado no slot 2 de itens!");
                
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            if( inventario.getItem3().getNome() == "Sem Item"){
                inventario.setItem3(estomago);
                System.out.println(this.estomago.getNome() + " adicionado no slot 3 de itens!");
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao1);
                    System.out.println(this.pocao1.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            System.out.println("Sem espaco para drops no inventario de itens!");
            
            if( inventario.getPocao1().foiUsada() == true){
                inventario.setPocao1(pocao1);
                System.out.println(this.pocao1.getNome() + " adicionado no slot 1 de pocoes!");
                return;
            }
            if( inventario.getPocao2().foiUsada() == true){
                inventario.setPocao2(pocao1);
                System.out.println(this.pocao1.getNome() + " adicionado no slot 2 de pocoes!");
                return;
            }
            if( inventario.getPocao3().foiUsada() == true){
                inventario.setPocao3(pocao1);
                System.out.println(this.pocao1.getNome() + " adicionado no slot 3 de pocoes!");
                return;
            }
            System.out.println("Sem espaco para drops no inventario de pocoes!");
        }
        if( Tipo == "Mini Boss"){
            if( inventario.getCavalo() == false){
                inventario.setCavalo(true);
                System.out.println("Cavalo adicionado ao inventario!");
            }
            if( inventario.getItem1().getNome() == "Sem Item"){
                inventario.setItem1(chifre);
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            if( inventario.getItem2().getNome() == "Sem Item"){
                inventario.setItem2(chifre);
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            if( inventario.getItem3().getNome() == "Sem Item"){
                inventario.setItem3(chifre);
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            System.out.println("Sem espaco para drops no inventario de itens!");
        }
        if( Tipo == "Boss"){
            if( inventario.getVassoura() == false){
                inventario.setVassoura(true);
                System.out.println("Vassoura Voadora adicionado ao inventario!");
            }
            if( inventario.getItem1().getNome() == "Sem Item"){
                inventario.setItem1(cauda);
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            if( inventario.getItem2().getNome() == "Sem Item"){
                inventario.setItem2(cauda);
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            if( inventario.getItem3().getNome() == "Sem Item"){
                inventario.setItem3(cauda);
                if( inventario.getPocao1().foiUsada() == true){
                    inventario.setPocao1(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 1 de pocoes!");
                    return;
                }
                if( inventario.getPocao2().foiUsada() == true){
                    inventario.setPocao2(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 2 de pocoes!");
                    return;
                }
                if( inventario.getPocao3().foiUsada() == true){
                    inventario.setPocao3(pocao2);
                    System.out.println(this.pocao2.getNome() + " adicionado no slot 3 de pocoes!");
                    return;
                }
                System.out.println("Sem espaco para drops no inventario de pocoes!");
                return;
            }
            System.out.println("Sem espaco para drops no inventario de itens!");
        }
    }
    
    public void dropar(Jogador jogador){
        if( jogador.getVida() > 9){
            if(jogador.getRupee() < 15){
                jogador.SomarRupee(green.getValor());
                System.out.println("Jogador recebeu 1 Rupee!");
                return;
            }
            if(jogador.getRupee() > 15 && jogador.getRupee() < 40){
                jogador.SomarRupee(blue.getValor());
                System.out.println("Jogador recebeu 5 Rupee!");
                return;
            }
            if(jogador.getRupee() > 40 && jogador.getRupee() < 90){
                jogador.SomarRupee(red.getValor());
                System.out.println("Jogador recebeu 10 Rupee!");
                return;
            }
            if(jogador.getRupee() > 90 && jogador.getRupee() < 300){
                jogador.SomarRupee(purple.getValor());
                System.out.println("Jogador recebeu 50 Rupee!");
                return;
            }
            if(jogador.getRupee() > 300 && jogador.getRupee() < 700){
                jogador.SomarRupee(silver.getValor());
                System.out.println("Jogador recebeu 100 Rupee!");
                return;
            }
            if(jogador.getRupee() > 700){
                jogador.SomarRupee(gold.getValor());
                System.out.println("Jogador recebeu 300 Rupee!");
                return;
            }
        }else{
            jogador.curar(4);
            System.out.println("Jogador foi curado ao matar o monstro!");
        }
    }
}
