
package projetosobrecarga;

public class ProjetoSobrecarga {
    public static void main(String[] args) {
     Mamifero m = new Mamifero();
     Cachorro c = new Cachorro();
     Lobo l = new Lobo();
     
     c.reagir("Bingo, vem!");
     c.reagir(12,45);
     c.reagir(true);
     c.reagir(false);
     c.reagir(7, 12f);
     c.reagir(16,20f);
    }
    
}
