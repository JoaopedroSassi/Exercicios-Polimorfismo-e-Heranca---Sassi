package ex02pessoas;


public class Miseravel extends PessoaComum {
    
    public void mostrarMiseravel(){
        System.out.println("Eu sou miseravel, infelizmente");
    }
    
    @Override
    public void respirar(){
        System.out.println("Miseravel Respirando");
    }
    
}
