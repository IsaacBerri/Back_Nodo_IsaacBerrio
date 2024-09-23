public class Multiplicacion extends Operaciones {
    Multiplicacion(double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public void operar(){
        double resultado = num1 * num2;
        System.out.println("La multiplicacion entre el numero " + num1 + " y el numero " + num2 + " es: " + resultado);
    }
}
