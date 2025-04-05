package aula011;
public class Aula011 {
    public static void main(String[] args) {
       /* não aceita pois a classe pessoa é abstrata
        Pessoa p1 = new Pessoa(); */
       
       /*
       TESTANDO CRIAÇÃO DE VISITANTE "HERANÇA POBRE"
       Visitante v1 = new Visitante();
       v1.setNome("Juvenal");
       v1.setIdade(22);
       v1.setSexo("M");
       System.out.println(v1.toString());*/
       
       Aluno a1 = new Aluno();
       a1.setNome("Claudio");
       a1.setMatricula(1111);
       a1.setCurso("Informatica");
       a1.setIdade(16);
       a1.setSexo("M");
       a1.PagarMensalidade();
       
       Bolsista b1 = new Bolsista();
       b1.setMatricula(1112);
       b1.setNome("Jubileu");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.PagarMensalidade();
       
       Professor p1 = new Professor();
       p1.setNome("Jose de Almeida");
       p1.setIdade(45);
       p1.setSexo("M");
       p1.setEspecialidade("Matematica");
       p1.setSalario(4500);
       p1.receberAumento(300f);
       System.out.println(p1.toString());
       
       Tecnico t1 = new Tecnico();
        t1.setRegistroProfissional(88766);
        t1.setNome("Mateus");
        t1.setIdade(26);
        t1.setSexo("M");
        t1.setMatricula(8080);
        t1.setCurso("Algoritmo");
        t1.PagarMensalidade();
       
    }
    
}
