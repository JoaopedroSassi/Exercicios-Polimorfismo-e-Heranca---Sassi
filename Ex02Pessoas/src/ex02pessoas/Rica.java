package ex02pessoas;


public class Rica extends PessoaComum {
    
     private double heranca;
     
    public double getHeranca() {
        return heranca;
    }

    public void setHeranca(double heranca) {
        this.heranca = heranca;
    }
    
    public void mostrarRico(){
        System.out.println("Eu sou rico pois meus pais tem dinheiro");
    }
     
    @Override
    public void respirar(){
        System.out.println("Rico Respirando");
    }
     

}
