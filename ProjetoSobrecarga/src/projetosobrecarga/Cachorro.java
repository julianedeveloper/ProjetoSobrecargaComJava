
package projetosobrecarga;

public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom(){
        System.out.println("Au,au,au,au.");
    }
    
    public void reagir(String frase){
        if(!"Bingo, vem!".equals(frase) && !"Cheguei".equals(frase)){
            System.out.println("Abanar o rabo e latir.");
    } else {
            System.out.println("Rosnar.");
        }
    }
    public void reagir(int hora,int min){
        if(hora<12){
            System.out.println("Abanar o rabo.");
        }else if(hora<=18){
            System.out.println("Ignorar.");
        }else {
            System.out.println("Abanar o rabo e latir.");
        }
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar o rabo.");
        }else{
            System.out.println("Rosnar e latir.");
            this.emitirSom();
        }
        
    }
    public void reagir(int idade, float peso){
        if (idade<5) {
            if (peso<10) {
                System.out.println("Abanar e pular.");
            } else {
                System.out.println("Cheirar.");
            }
        } else {
            if (peso<10) {
                System.out.println("Abanar e sentar.");
            } else {
                System.out.println("");
            }
        }
    }
}
