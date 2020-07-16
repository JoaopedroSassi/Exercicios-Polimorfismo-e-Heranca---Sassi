package ex01;


public class Adm extends Assist {
    public String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    @Override
    public void exibeDados(){
        
                System.out.println("Informações do ADM " +
                
                "\n Nome: " + getNome() + 
                "\n Salario: " + getSalario() +
                "\n Número da Matricula: " + getCod_mat() +
                "\n Idade: " + getIdade() +
                "\n Setor: Setor de Administração" + 
                "\n Turno: " + turno +
                "\n -----------------------------");
                
    }
         
    
    }

