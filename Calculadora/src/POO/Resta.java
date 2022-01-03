package POO;

public class Resta {
    private int numero_uno;
    private int numero_dos;
    private int resultado;

    public Resta(){
        numero_uno=0;
        numero_dos=0;
        resultado=0;
    }
    public int obtener_resultado(){
        return resultado;
    }
    public void realizar_operacion(int numero_uno, int numero_dos){
        this.numero_uno=numero_uno;
        this.numero_dos=numero_dos;
        resultado=this.numero_uno-this.numero_dos;

    }
}
