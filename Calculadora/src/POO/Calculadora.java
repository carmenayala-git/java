package POO;

public class Calculadora {
    public static void main(String[] args){
      int numero_uno=20;
      int numero_dos=2;

      System.out.println("Hello desde la calculadora");
      Suma suma= new Suma();
      suma.realizar_operacion(numero_uno,numero_dos);
        System.out.println( suma.resultado_suma());

        Resta substraccion= new Resta();
      substraccion.realizar_operacion(numero_uno,numero_dos);
        System.out.println(substraccion.obtener_resultado());

        Multiplicacion multiplication= new Multiplicacion();
        multiplication.realizar_operacion(numero_uno,numero_dos);
        System.out.println(multiplication.obtener_resultado());

        Division divition= new Division();
      divition.realizar_operacion(numero_uno,numero_dos);
        System.out.println(divition.obtener_resultado());

    }
}
