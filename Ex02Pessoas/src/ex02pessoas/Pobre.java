package ex02pessoas;


public class Pobre extends PessoaComum {
    
    public void mostrarPobre(){
        System.out.println("Eu sou pobre, to tentando trabalhar, mas ta com uma pandemia =(");
    }
    
    @Override
    public void respirar() {
        System.out.println("Pobre Respirando");
    }
    
}
