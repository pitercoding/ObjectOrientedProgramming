package aula011;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento (float aum){
        this.salario += aum;
          System.out.println("Salario com aumento é: " + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
         System.out.println("Especialidade é: " + this.especialidade); 
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
         System.out.println("Salario atual é : " + this.salario);
    }
    
    
}
