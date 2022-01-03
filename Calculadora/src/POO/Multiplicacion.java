package POO;

public class Multiplicacion {
    private int numero_uno;
    private int numero_dos;
    private int resultado;

    public Multiplicacion(){
       resultado=0;
       numero_uno=0;
       numero_dos=0;
    }
    public int obtener_resultado(){
        return resultado;
    }
    public void realizar_operacion(int numero_uno,int numero_dos){
        this.numero_uno=numero_uno;
        this.numero_dos=numero_dos;
        resultado= this.numero_uno*this.numero_dos;
    }
}
