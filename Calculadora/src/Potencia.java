public class Potencia extends Operaciones {
    Potencia(double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public void operar(){
        double resultado = Math.pow(num1, num2);
        System.out.println("La potencia de " + num1 + " elevado a " + num2 + " es: " + resultado);

    }
}
