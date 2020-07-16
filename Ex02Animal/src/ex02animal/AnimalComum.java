package ex02animal;


public class AnimalComum {
    protected String nome;
    protected String raca;
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void andar (){
        System.out.println("To andando igual um loko!!!!!");
    }


    
}
