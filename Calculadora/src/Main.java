public class Main {
    public static void main(String[] args) {
        Suma suma1 = new Suma(4, 8);
        suma1.operar();

        Resta resta1 = new Resta(5, 2);
        resta1.operar();

        Multiplicacion multiplicacion1 = new Multiplicacion(4, 8);
        multiplicacion1.operar();

        Divicion divicion1 = new Divicion(8, 25);
        divicion1.operar();
    }
}