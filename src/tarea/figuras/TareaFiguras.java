
package tarea.figuras;

public class TareaFiguras {

 
    public static void main(String[] args) {
        
        System.out.println("Perimetro de las figuras geometricas de Cuadrado Y Cubo \n");
        Plana pla= new Plana("Si", "Cuadrado", 100.00, 25.00, 25.00);
       pla.tipoFigura();
       pla.ladoa();
       pla.ladob();
       pla.perimetral();
       pla.plana1();
        System.out.println("\nPerimetro de las figuras geometricas de Cuadrado Y Cubo \n");
   Noplana nopla=new Noplana("No", "cubo", 60.00, 5.00, 5.00);
       nopla.tipoFigura();
       nopla.ladoa();
       nopla.ladob();
       nopla.perimetral();
       nopla.Noplana1();
     
    }
    
}
