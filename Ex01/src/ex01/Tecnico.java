package ex01;


public class Tecnico extends Assist {
    public double aumenta;
    
    public double getAumenta() {
        return aumenta;
    }

    public void setAumenta(double aumenta) {
        this.aumenta = aumenta;
    }
   
    public double bonificacao(){
        this.salario = salario + aumenta;
        return salario;
    }
    
    @Override
    public void exibeDados() {
        
        System.out.println("Informações do Tecnico " +
                
                "\n Nome: " + getNome() + 
                "\n Salario: " + getSalario() +
                "\n Número da Matricula: " + getCod_mat() +
                "\n Idade: " + getIdade() +
                "\n -----------------------------");
                
                
    }
}

