package ex03;


public class ImovelComum {
         public String endereco;
         public double valor;
         
         
         
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }     
         
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
  

    public void Fiscal(){
        System.out.println("Dados pra alugar aquele AP \n" +
                          "\n Valor: R$ " + valor + 
                          "\n Endereço: " + endereco);
    }
    
}
