public class Suma extends Operaciones {
    Suma(int numero1, int numero2){
        super(numero1, numero2);
    }

    @Override
    public void operar(){
        int resultado = num1 + num2;
        System.out.println("La suma de el numero " + super.num1 + " y el numero " + super.num2 + " es: " + resultado);
    }
}
