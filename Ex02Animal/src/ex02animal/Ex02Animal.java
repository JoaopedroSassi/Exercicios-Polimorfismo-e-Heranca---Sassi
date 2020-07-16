package ex02animal;


public class Ex02Animal {


    public static void main(String[] args) {
        
        Dog coragem = new Dog();
        Cat napolitano = new Cat();
        
        coragem.andar();
        coragem.latir();
        
        System.out.println("____________________________________");
        
        napolitano.andar();
        napolitano.miando();
        
        
    }
    
}
