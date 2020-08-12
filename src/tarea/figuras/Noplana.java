
package tarea.figuras;

public class Noplana extends Figurageometrica {
String noplana1;
    public Noplana(String noplana1,String figura, Double perimetro, Double lado1, Double lado2) {
     super(figura, perimetro, lado1, lado2);
        this.noplana1=noplana1;
        
    }
   

   public void Noplana1(){
          System.out.println("Esta figura "+this.noplana1+" es plana");
   }
    
   public void tipoFigura()
   {
       System.out.printf("Esta figura geometrica es un: %s \n",figura);
   }
  
}

