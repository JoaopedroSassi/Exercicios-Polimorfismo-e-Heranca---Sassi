package ex02pessoas;


public class Ex02Pessoas {


    public static void main(String[] args) {
        
        Rica Nicolau = new Rica();
        Pobre Joao = new Pobre();
        Miseravel Ednaldo = new Miseravel();
        
        Nicolau.respirar();
        Nicolau.mostrarRico();
        
        System.out.println("________________________________________________________");
                
        Joao.respirar();
        Joao.mostrarPobre();
        
        System.out.println("________________________________________________________");
        
        Ednaldo.respirar();
        Ednaldo.mostrarMiseravel();
        
    }
    
}
