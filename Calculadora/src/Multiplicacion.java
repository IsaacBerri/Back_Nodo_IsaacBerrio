public class Multiplicacion extends Operaciones {
    Multiplicacion(int numero1, int numero2){
        super(numero1, numero2);
    }

    @Override
    public void operar(){
        int resultado = num1 * num2;
        System.out.println("La multiplicacion entre el numero " + num1 + " y el numero " + num2 + " es: " + resultado);
    }
}
