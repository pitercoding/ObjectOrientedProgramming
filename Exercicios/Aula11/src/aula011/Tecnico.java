package aula011;
public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("Tecnico informatica");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
        System.out.println("Profissional de TECNOLOGIA");
    }
    
    
}
