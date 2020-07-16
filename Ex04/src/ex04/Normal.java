package ex04;


public class Normal extends Ingresso {
    
    @Override
    public void mostrarCusto(){
        System.out.println("O custo do seu ingresso é de: R$" + custo +
                "\n Tipo: Normal");
    }
}
