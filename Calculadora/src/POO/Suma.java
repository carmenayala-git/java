package POO;

public class Suma {
    //propiedades
    private int numero_uno;
    private int numero_dos;
    private int resultado;

    //metodo constructor
 public Suma(){
     numero_uno= 0;
     numero_dos= 0;
     resultado= 0;
    }
    //getter/setter
    public int resultado_suma(){
     return resultado;
    }
    //otros metodos
    public void realizar_operacion(int numero_uno, int numero_dos){
     this.numero_uno=numero_uno;
     this.numero_dos=numero_dos;
     resultado=this.numero_uno+this.numero_dos;

    }
}
