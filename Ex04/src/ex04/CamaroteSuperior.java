package ex04;


public class CamaroteSuperior extends Vip {
    public String local = "Camarote SUPERIOR MUITO LOKO";
    
    public double aux2() {
       double addd = this.aux() + 100;
       return addd;
    }
    
    @Override
    public void mostrarCusto(){
        System.out.println("O custo do seu ingresso é de: R$" + this.aux2() +
                "\n Tipo: Vip nivel 1 - Esse é o mais top de todos, você pagou muito" +
                "\n Local: " + local);
    }
}
