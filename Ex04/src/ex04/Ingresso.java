package ex04;


public class Ingresso {
    public double custo = 100;
    
    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    public void mostrarCusto(){
        System.out.println("O custo do seu ingresso é de: R$" + custo);
    }
    
}
