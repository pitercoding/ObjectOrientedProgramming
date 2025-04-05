package aula12;
public class Aula12 {
    public static void main(String[] args) {
        //Animal n = new Animal(); ERRO
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        //m.setPeso(35.3f);
        //m.setCorPelo("Marrom");
        //m.alimentar();
        //m.locomover();
        //m.emitirSom();
        
        //a.setPeso(23.7f);
        //a.setCorPena("Branco");
       // a.alimentar();
        //a.locomover();
        //a.emitirSom();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t =new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        k.locomover();
        k.emitirSom();
    }
    
}
