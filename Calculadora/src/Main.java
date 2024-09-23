import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        double num1;
        double num2;

        do {
            try {
                System.out.println("Ingrese el numero de la operacion a realizar \n" +
                        "1. Suma \n" +
                        "2. Resta \n" +
                        "3. Multiplicacion \n" +
                        "4. Divicion \n" +
                        "5. Potenciacion \n");
                option = sc.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Ingrese el primer numero: ");
                        num1 = sc.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        num2 = sc.nextDouble();
                        Suma sum = new Suma(num1, num2);
                        sum.operar();
                        break;
                    case 2:
                        System.out.println("Ingrese el primer numero: ");
                        num1 = sc.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        num2 = sc.nextDouble();
                        Resta res = new Resta(num1, num2);
                        res.operar();
                        break;
                    case 3:
                        System.out.println("Ingrese el primer numero: ");
                        num1 = sc.nextDouble();
                        System.out.println("Ingrese el segundo numero: ");
                        num2 = sc.nextDouble();
                        Multiplicacion mul = new Multiplicacion(num1, num2);
                        mul.operar();
                        break;
                    case 4:
                        try{
                            System.out.println("Ingrese el primer numero: ");
                            num1 = sc.nextDouble();
                            System.out.println("Ingrese el segundo numero: ");
                            num2 = sc.nextDouble();
                            Divicion div = new Divicion(num1, num2);
                            div.operar();
                        }catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        Potencia pow = new Potencia(num1, num2);
                        pow.operar();
                        break;
                    default:
                        System.out.println("La opcion numero " + option + " no esta disponible");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Ingresaste texto en vez de numeros");
            }
        }while (option > 5);
    }
}