package ex03;

import java.util.Scanner;


public class Ex03 {


    public static void main(String[] args) {
        
      Scanner vizu = new Scanner(System.in);
      System.out.println("MENU IMOVEL \n" + 
                        "\n 1 - Imovel Novo" +
                        "\n 2 - Imovel Velho");
      int aux2 = vizu.nextInt(); 
            
      switch(aux2) {
          case 1:
              ImovelNovo novo = new ImovelNovo();
              novo.setEndereco("Rua Antonio Peixoto Augusto, N°65");
              novo.setValor(10500);  
              novo.Fiscal();
          break;
          case 2:
              ImovelUsado usado = new ImovelUsado();
              usado.setEndereco("Rua Ednaldo Pereira Vale Nada Vale Tudo, N°777");
              usado.setValor(1);             
              usado.Fiscal();
      }  
            
        
    }
    
}
