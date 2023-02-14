
package projetosobrecarga;

public class Mamifero extends Animal{
    
    protected String corDoPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero.");
    }
    
}
