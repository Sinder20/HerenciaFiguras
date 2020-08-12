
package tarea.figuras;

public class Figurageometrica {
    String figura;
    
    Double perimetro, lado1, lado2;
  public Figurageometrica(String figura, Double perimetro, Double lado1, Double lado2){
      this.figura=figura;
      this.perimetro=perimetro;
      this.lado1=lado1;
      this.lado2=lado2;
      
  }
  
    

  public void perimetral(){
      System.out.println("El perimetro del "+this.figura+" es: "+this.perimetro);
  
  }
  public void ladoa(){
        System.out.println("El primer lado es:  "+this.lado1+"");
    
  }
  public void ladob(){
      System.out.println("El segundo lado es:  "+this.lado2+"");
  }
}
