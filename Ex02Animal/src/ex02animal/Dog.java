package ex02animal;


public class Dog extends AnimalComum{
    
    public void latir(){
        System.out.println("Estou latindo");
    }
    
    @Override
    public void andar (){
        System.out.println("Eu, coragem o cão covarde, estou andando");
    }
}
