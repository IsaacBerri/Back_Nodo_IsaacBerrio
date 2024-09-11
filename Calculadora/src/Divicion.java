public class Divicion extends Operaciones {
    Divicion(int numero1, int numero2){
        super(numero1, numero2);
    }

    @Override
    public void operar(){
        double resultado = (double) num1 / num2;
        System.out.println("La divicion entre el numero " + num1 + " y el numero " + num2 + " es: " + resultado);
    }
}
