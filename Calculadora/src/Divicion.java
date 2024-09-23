public class Divicion extends Operaciones {
    Divicion(double numero1, double numero2){
        super(numero1, numero2);
    }

    @Override
    public void operar(){
        if(num2 == 0){
            throw new IllegalArgumentException("No se puede dividir por 0");
        }else {
            double resultado = num1 / num2;
            System.out.println("La divicion entre el numero " + num1 + " y el numero " + num2 + " es: " + resultado);
        }
    }
}
