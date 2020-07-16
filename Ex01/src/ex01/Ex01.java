package ex01;

public class Ex01 {


    public static void main(String[] args) {
        Adm admin = new Adm();
        Tecnico tecEtec = new Tecnico();
        
        
       admin.setNome("Alcione");
       admin.setSalario(9000);
       admin.setCod_mat(1);
       admin.setIdade(96);
       admin.setTurno("Integral");
       admin.exibeDados();  
        
       tecEtec.setNome("Bon Jovi");
       tecEtec.setSalario(3500);
       tecEtec.setCod_mat(2);
       tecEtec.setIdade(77);       
       tecEtec.setAumenta(1000);
       tecEtec.bonificacao();
       tecEtec.exibeDados(); 
    }
    
}
