public class Resta extends Operaciones {

    Resta(double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public void operar() {
        double resultado = num1 - num2;
        System.out.println("La resta de el numero " + num1 + " y el numero " + num2 + " es: " + resultado);
    }
}
