package ex04;


public class Vip extends Ingresso {
    
    public double aux() {
       double add = custo + 50;
       return add;
    }
    
    @Override
    public void mostrarCusto() {
        System.out.println("O valor do seu ingresso é de: " + this.aux());
    }
}
