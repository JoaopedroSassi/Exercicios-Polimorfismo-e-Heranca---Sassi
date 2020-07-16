package ex01;


public class Assist extends FuncComum{
    
    public void exibeDados(){
        System.out.println("Informações do Assistente " +
                "\n -----------------------------" +
                "\n Nome: " + getNome() + 
                "\n Salario: " + getSalario() +
                "\n Número da Matricula: " + getCod_mat() +
                "\n Idade: " + getIdade());
                
                
    }
    
}
