package ex04;

import java.util.Scanner;


public class Ex04 {


    public static void main(String[] args) {
        Scanner vizu = new Scanner(System.in);
        System.out.println("MENU BALADINHA \n" + 
                        "\n 1 - Ingresso Normal" +
                        "\n 2 - Ingresso Vip");
        int auxA = vizu.nextInt();
    
 
        System.out.println("________________________________________________________");
        
        switch(auxA){
            case 1:
                Normal ingres = new Normal();
                ingres.mostrarCusto();
            break;
            
               
                
            case 2:
                    System.out.println("MENU INGRESSO VIP \n" + 
                    "\n 1 - Camarote Superior" +
                    "\n 2 - Camarote Inferior");
                int auxB = vizu.nextInt();
            
    
        switch(auxB){
            case 1:
                System.out.println("________________________________________________________");
                CamaroteSuperior CamaSup = new CamaroteSuperior();       
                CamaSup.mostrarCusto();
            break;
                    
            case 2:
                System.out.println("________________________________________________________");
                CamaroteInferior CamaInf = new CamaroteInferior();
                CamaInf.mostrarCusto();
                break;
                    }
        }
}
}

