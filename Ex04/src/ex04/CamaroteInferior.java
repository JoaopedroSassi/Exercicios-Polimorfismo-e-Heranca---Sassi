package ex04;


public class CamaroteInferior extends Vip {
    public String local = "Camarote Inferior";
    
    @Override
    public void mostrarCusto(){
        System.out.println("O custo do seu ingresso é de: R$" + this.aux() +
                "\n Tipo: Vip nivel 2 - É bom, mas não o melhor" +
                "\n Local: " + local);
    }
}
