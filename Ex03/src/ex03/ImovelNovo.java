package ex03;


public class ImovelNovo extends ImovelComum {
    
    double aux;

    public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }
    
    public double valorNovo(){
        aux = valor * 1.2;
        return valor;
    }
    
    @Override
    public void Fiscal(){
               System.out.println("Dados pra alugar aquele AP NOVO NA PAULISTA \n" +
                          "\n Valor: R$ " + valor + 
                          "\n Endereço: " + endereco);
     
    }
    
}
