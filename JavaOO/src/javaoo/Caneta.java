
package javaoo;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.print("Uma caneta " + this.cor);
        System.out.println(" de ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Caneta tampada");
        } else {
                    System.out.println("Rasbicando");
                    }
        
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
}
