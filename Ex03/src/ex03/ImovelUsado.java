package ex03;


public class ImovelUsado extends ImovelComum{
    
    public double valorVelho(){
        valor = valor *0.8;
        return valor;
    }
    
    @Override
    public void Fiscal () {
        System.out.println("Dados pra alugar aquele AP meio velhinho \n" +
                          "\n Valor: R$ " + valor + 
                          "\n Endereço: " + endereco);
    }
}
