
package tarea.figuras;

public class Plana extends Figurageometrica {
String plana1;
    public Plana(String plana1,String figura, Double perimetro, Double lado1, Double lado2) {
     super(figura, perimetro, lado1, lado2);
        this.plana1=plana1;
        
    }
   

   public void plana1(){
          System.out.println("Esta figura "+this.plana1+" es plana \n");
   
   }
    
   public void tipoFigura(){
       System.out.printf("Esta figura geometrica es un: %s \n",figura);
   }
}
    

